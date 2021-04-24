package ipam.uts18090027.InaSnack.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import ipam.uts18090027.InaSnack.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)