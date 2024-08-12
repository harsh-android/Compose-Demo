package com.aviansoft.composedemo.Model.EVCars

import com.google.gson.annotations.SerializedName

data class EVCarModelModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemEV?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class PriceModel(

	@field:SerializedName("min_ex_showroom_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("max_ex_showroom_price")
	val maxExShowroomPrice: String? = null
)

data class DataItemEV(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("price")
	val price: PriceModel? = null,

	@field:SerializedName("wishlist")
	var wishlist: Boolean? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null,

	@field:SerializedName("rating_type_name")
	val ratingTypeName: String? = null
)
