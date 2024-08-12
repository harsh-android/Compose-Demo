package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarModuleModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemCM?>? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class VariantsItemCM(

	@field:SerializedName("variant_id")
	val variantId: String? = null,

	@field:SerializedName("variant_image")
	val variantImage: String? = null,

	@field:SerializedName("ex_showroom_price")
	val exShowroomPrice: Int? = null,

	@field:SerializedName("variant_name")
	val variantName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("feature_value")
	val featureValue: List<FeatureValueItem?>? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null,

	@field:SerializedName("fuel_type")
	val fuelType: String? = null,

	var compare: Boolean? = false
)

data class DataItemCM(

	@field:SerializedName("model_transmission")
	val modelTransmission: String? = null,

	@field:SerializedName("car_graphics")
	val carGraphics: List<CarGraphicsItem?>? = null,

	@field:SerializedName("wishlist")
	var wishlist: Boolean? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("brand_logo")
	val brandLogo: String? = null,

	@field:SerializedName("variants")
	val variants: List<VariantsItemCM?>? = null,

	@field:SerializedName("cs_name")
	val csName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null,

	@field:SerializedName("rating_type_name")
	val ratingTypeName: String? = null,

	@field:SerializedName("max_price")
	val maxPrice: Int? = null,

	@field:SerializedName("min_price")
	val minPrice: Int? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("model_mileage")
	val modelMileage: String? = null,

	@field:SerializedName("model_description")
	val modelDescription: String? = null,

	@field:SerializedName("model_bhp")
	val modelBhp: String? = null,

	@field:SerializedName("model_engine")
	val modelEngine: String? = null,

	@field:SerializedName("model_fuel")
	val modelFuel: String? = null
)

data class FeatureValueItem(

	@field:SerializedName("variant_id")
	val variantId: String? = null,

	@field:SerializedName("features_name")
	val featuresName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("feature_value")
	val featureValue: String? = null
)

data class CarGraphicsItem(

	@field:SerializedName("graphic_file_mob")
	val graphicFileMob: List<String?>? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("gt_name")
	val gtName: String? = null
)
