package com.aviansoft.composedemo.Model.TestDrive

import com.google.gson.annotations.SerializedName

data class BrandModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<TestDriveDataItem?>? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class TestDriveDataItem(

	@field:SerializedName("models")
	val models: List<ModelsItem?>? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)

data class FeatureValues(

	@field:SerializedName("fuel_type")
	val fuelType: List<String?>? = null
)

data class ModelsItem(

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("feature_values")
	val featureValues: FeatureValues? = null
)
