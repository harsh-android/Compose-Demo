package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class EVBannerModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataEV? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class EvCarItem(

	@field:SerializedName("Charging_Time")
	val chargingTime: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("banner_id")
	val bannerId: String? = null,

	@field:SerializedName("price")
	val price: Price? = null,

	@field:SerializedName("model_type")
	val modelType: String? = null,

	@field:SerializedName("Type_of_Transmission")
	val typeOfTransmission: String? = null,

	@field:SerializedName("Battery_Capacity")
	val batteryCapacity: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("banner_image")
	val bannerImage: String? = null,

	@field:SerializedName("Range")
	val range: String? = null,

	@field:SerializedName("Power")
	val power: String? = null
)

data class FeatureItem(

	@field:SerializedName("feature_id")
	val featureId: String? = null,

	@field:SerializedName("su_id")
	val suId: String? = null,

	@field:SerializedName("su_name")
	val suName: String? = null,

	@field:SerializedName("features_name")
	val featuresName: String? = null,

	@field:SerializedName("features_image")
	val featuresImage: String? = null
)

data class Price(

	@field:SerializedName("min_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("max_price")
	val maxExShowroomPrice: String? = null
)

data class DataEV(

	@field:SerializedName("feature")
	val feature: List<FeatureItem?>? = null,

	@field:SerializedName("Ev_Car")
	val evCar: List<EvCarItem?>? = null
)
