package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class AllBMVModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemAll?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class VariantsItemAll(

	@field:SerializedName("variant_id")
	val variantId: String? = null,

	@field:SerializedName("variant_name")
	val variantName: String? = null
)

data class DataItemAll(

	@field:SerializedName("models")
	val models: List<ModelsItemAll?>? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)

data class ModelsItemAll(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("variants")
	val variants: List<VariantsItemAll?>? = null
)
