package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class UpcomingCarModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class Data(

	@field:SerializedName("car_data")
	val carData: List<CarDataItem?>? = null
)

data class CarDataItem(

	@field:SerializedName("max_price")
	val maxPrice: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("min_price")
	val minPrice: String? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("launch_date")
	val launchDate: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)
