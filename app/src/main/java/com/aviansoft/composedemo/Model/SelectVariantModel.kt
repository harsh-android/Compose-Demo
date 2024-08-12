package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class SelectVariantModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemSV?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class FeaturesName(

	@field:SerializedName("type_of_transmission")
	val typeOfTransmission: String? = null,

	@field:SerializedName("displacement")
	val displacement: String? = null,

	@field:SerializedName("mileage")
	val mileage: String? = null
)

data class DataItemSV(

	@field:SerializedName("variant_id")
	val variantId: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("variant_image")
	val variantImage: String? = null,

	@field:SerializedName("ex_showroom_price")
	val exShowroomPrice: String? = null,

	@field:SerializedName("ex_showroom_price_integer")
	val exShowroomPriceInt: Int? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("variant_name")
	val variantName: String? = null,

	@field:SerializedName("features_name")
	val featuresName: FeaturesName? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("type_of_fuel")
	val typeOfFuel: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)
