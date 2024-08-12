package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class BrandDetailModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: BrandData? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class ModelsItem(

	@field:SerializedName("ct_name")
	val ctName: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("variant_image")
	val variantImage: String? = null,

	@field:SerializedName("price")
	val price: BrandPrice? = null,

	@field:SerializedName("wishlist")
	var wishlist: Boolean? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("rating_type_name")
	val ratingTypeName: String? = null
)

data class BrandData(

	@field:SerializedName("models")
	val models: List<ModelsItem?>? = null,

	@field:SerializedName("brand_description")
	val brandDescription: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_logo")
	val brandLogo: String? = null,

	@field:SerializedName("brand_banner")
	val brandBanner: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)

data class BrandPrice(

	@field:SerializedName("min_ex_showroom_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("max_ex_showroom_price")
	val maxExShowroomPrice: String? = null
)
