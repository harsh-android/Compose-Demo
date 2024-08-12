package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class PopolarCityModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataPopCity? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class PopularCityItem(

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("city_image")
	val cityImage: String? = null,

	@field:SerializedName("city_id")
	val cityId: String? = null
)

data class DataPopCity(

	@field:SerializedName("other_city")
	val otherCity: List<OtherCityItem?>? = null,

	@field:SerializedName("popular_city")
	val popularCity: List<PopularCityItem?>? = null
)

data class OtherCityItem(

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("city_id")
	val cityId: String? = null
)
