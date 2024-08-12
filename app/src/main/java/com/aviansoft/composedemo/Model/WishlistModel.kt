package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class WishlistModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemWish?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)




public final data class DataItemWish(

	@field:SerializedName("model_image")
	val modelImage: String? = "",

	@field:SerializedName("rating_value")
	val ratingValue: String? = "",

	@field:SerializedName("model_type")
	val modelType: String? = "",

	@field:SerializedName("variant_engine")
	val variantEngine: String? = "",

	@field:SerializedName("brand_name")
	val brandName: String? = "",

	@field:SerializedName("model_id")
	val modelId: String? = "",

	@field:SerializedName("brand_id")
	val brandId: String? = "",

	@field:SerializedName("variant_mileage")
	val variantMileage: String? = "",

	@field:SerializedName("max_price")
	val maxPrice: String? = "",

	@field:SerializedName("variant_transmission")
	val variantTransmission: String? = "",

	@field:SerializedName("model_name")
	val modelName: String? = "",

	@field:SerializedName("min_price")
	val minPrice: String? = "",

	@field:SerializedName("model_bhp")
	val modelBhp: String? = "",

	@field:SerializedName("customer_id")
	val customerId: String? = "",

	@field:SerializedName("model_fuel")
	val modelFuel: String? = ""
)
