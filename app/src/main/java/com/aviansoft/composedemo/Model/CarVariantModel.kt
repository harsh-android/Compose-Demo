package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarVariantModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemVariant?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemVariant(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("seating_capacity")
	val seatingCapacity: Int? = null,

	@field:SerializedName("variant_image")
	val variantImage: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("variant_name")
	val variantName: String? = null,

	@field:SerializedName("color_name")
	val colorName: String? = null,

	@field:SerializedName("variant_color_image")
	val variantColorImage: String? = null
)
