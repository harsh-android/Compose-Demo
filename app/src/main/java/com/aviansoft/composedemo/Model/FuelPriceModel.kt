package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class FuelPriceModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataFuel? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataFuel(

	@field:SerializedName("diesel")
	val diesel: String? = null,

	@field:SerializedName("petrol")
	val petrol: String? = null,

	@field:SerializedName("cng")
	val cng: String? = null
)
