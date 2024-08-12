package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class AllCityModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemCity?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemCity (

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("city_id")
	val cityId: String? = null
)
