package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarModuleSpectsModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataCMS? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class PriceEntryItem(

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("total_price")
	val totalPrice: Double? = null,

	@field:SerializedName("total_price_company")
	val totalPriceCompany: Double? = null,

	@field:SerializedName("ex_showroom_price")
	val exShowroomPrice: Int? = null,

	@field:SerializedName("emi_starting_from")
	val emiStartingFrom: String? = null,

	@field:SerializedName("tax_details")
	val taxDetails: List<TaxDetailsItem?>? = null
)

data class SpecItem(

	@field:SerializedName("features")
	val features: List<FeaturesItem?>? = null,

	@field:SerializedName("spec_image")
	val specImage: String? = null,

	@field:SerializedName("spec_id")
	val specId: Int? = null,

	@field:SerializedName("spec_name")
	val specName: String? = null
)

data class TaxDetailsItem(

	@field:SerializedName("tax_cost")
	val taxCost: Double? = null,

	@field:SerializedName("tax_name")
	val taxName: String? = null
)

data class ColorItemCM(

	@field:SerializedName("variant_color_image_path")
	val variantColorImagePath: String? = null,

	@field:SerializedName("dual_color_code")
	val dualColorCode: String? = null,

	@field:SerializedName("color_name")
	val colorName: String? = null,

	@field:SerializedName("color_code")
	val colorCode: String? = null
)

data class DataCMS(

	@field:SerializedName("price_entry")
	val priceEntry: List<PriceEntryItem?>? = null,

	@field:SerializedName("specification_cat")
	val specificationCat: List<SpecificationCatItemCMS?>? = null,

	@field:SerializedName("variant_id")
	val variantId: String? = null,

	@field:SerializedName("color")
	val color: List<ColorItemCM?>? = null,

	@field:SerializedName("variant_name")
	val variantName: String? = null
)

data class FeaturesItem(

	@field:SerializedName("su_name")
	val suName: String? = null,

	@field:SerializedName("features_name")
	val featuresName: String? = null,

	@field:SerializedName("feature_value")
	val featureValue: String? = null
)

data class SpecificationCatItemCMS(

	@field:SerializedName("spec_cat_name")
	val specCatName: String? = null,

	@field:SerializedName("sc_id")
	val scId: Int? = null,

	@field:SerializedName("spec")
	val spec: List<SpecItem?>? = null
)
