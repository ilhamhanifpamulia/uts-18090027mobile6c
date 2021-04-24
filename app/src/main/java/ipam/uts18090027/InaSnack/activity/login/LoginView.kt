package ipam.uts18090027.InaSnack.activity.login

import ipam.uts18090027.InaSnack.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}