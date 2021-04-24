package ipam.uts18090027.InaSnack.activity.register.presenter

import ipam.uts18090027.InaSnack.model.User
import ipam.uts18090027.InaSnack.network.NetworkConfig
import ipam.uts18090027.InaSnack.response.ResultSimple
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterPresenter(val registerView: RegisterView) {
    fun register(user: User) {
        NetworkConfig.service()
            .registerUser(user.username, user.email, user.password, user.hp)
            .enqueue(object: Callback<ResultSimple> {
                override fun onFailure(call: Call<ResultSimple>, t: Throwable) {
                    registerView.onErrorRegister(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResultSimple>,
                    response: Response<ResultSimple>
                ) {
                    if (response.body()?.status == 200) {
                        registerView.onSuccessRegister()
                    } else {
                        registerView.onErrorRegister(response.body()?.message)
                    }
                }

            })
    }
}