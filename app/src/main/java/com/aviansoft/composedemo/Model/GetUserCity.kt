package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class DataUserCity(

	@field:SerializedName("selected_city_id")
	val selectedCityId: String? = null,

	@field:SerializedName("selected_city_name")
	val selectedCityName: String? = null
)

data class GetUserCity(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataUserCity>? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
