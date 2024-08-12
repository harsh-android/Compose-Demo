package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class SelectModelModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemSM?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class PriceSM(

	@field:SerializedName("min_ex_showroom_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("max_ex_showroom_price")
	val maxExShowroomPrice: String? = null
)

data class DataItemSM(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("price")
	val price: PriceSM? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null
)
