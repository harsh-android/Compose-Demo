package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class ModelDetailModel(

    @field:SerializedName("msg")
    val msg: String? = null,

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("data")
    val data: List<DataItemModelDetail?>? = null,

    @field:SerializedName("status")
    val status: Boolean? = null
)

data class SpecificationCatItem(

    @field:SerializedName("spec_cat_name")
    val specCatName: String? = null,

    @field:SerializedName("sc_id")
    val scId: Int? = null,

    @field:SerializedName("spec")
    val spec: List<SpecItemModel?>? = null
)

data class CarGraphicTypeItem(

    @field:SerializedName("car_graphic_type_id")
    val carGraphicTypeId: String? = null,

    @field:SerializedName("car_graphic_type_name")
    val carGraphicTypeName: String? = null,

    @field:SerializedName("car_graphics")
    val carGraphicImages: List<String?>? = null,

    @field:SerializedName("model_id")
    val modelId: String? = null
)

data class PriceEntry(

    @field:SerializedName("city_name")
    val cityName: String? = null,

    @field:SerializedName("ut_name")
    val utName: Any? = null,

    @field:SerializedName("variant_id")
    val variantId: Int? = null,

    @field:SerializedName("total_price")
    val totalPrice: Double? = null,

    @field:SerializedName("state_name")
    val stateName: String? = null,

    @field:SerializedName("ex_showroom_price")
    val exShowroomPrice: Int? = null,

    @field:SerializedName("tax_name")
    val taxName: List<TaxNameItemModel?>? = null,

    @field:SerializedName("country_name")
    val countryName: String? = null,

    @field:SerializedName("variant_name")
    val variantName: String? = null,

    @field:SerializedName("price_entry_id")
    val priceEntryId: Int? = null
)

data class DataItemModelDetail(

    @field:SerializedName("model_transmission")
    val modelTransmission: String? = null,

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

    @field:SerializedName("brand_logo")
    val brandLogo: String? = null,

    @field:SerializedName("variants")
    val variants: List<VariantsItem?>? = null,

    @field:SerializedName("brand_id")
    val brandId: String? = null,

    @field:SerializedName("rating_type_name")
    val ratingTypeName: String? = null,

    @field:SerializedName("car_graphic_type")
    val carGraphicType: List<CarGraphicTypeItem?>? = null,

    @field:SerializedName("max_price")
    val maxPrice: String? = null,

    @field:SerializedName("model_name")
    val modelName: String? = null,

    @field:SerializedName("min_price")
    val minPrice: String? = null,

    @field:SerializedName("rating_id")
    val ratingId: Int? = null,

    @field:SerializedName("model_mileage")
    val modelMileage: String? = null,

    @field:SerializedName("model_bhp")
    val modelBhp: String? = null,

    @field:SerializedName("model_engine")
    val modelEngine: String? = null,

    @field:SerializedName("model_fuel")
    val modelFuel: String? = null,

    @field:SerializedName("wishlist")
    var wishlist: Boolean? = null
)

data class VariantsItem(

    @field:SerializedName("price_entry")
    val priceEntry: PriceEntry? = null,

    @field:SerializedName("specification_cat")
    val specificationCat: List<SpecificationCatItem?>? = null,

    @field:SerializedName("variant_image")
    val variantImage: String? = null,

    @field:SerializedName("ex_showroom_price")
    val exShowroomPrice: Int? = null,

    @field:SerializedName("type_of_transmission")
    val typeOfTransmission: String? = null,

    @field:SerializedName("variant_name")
    val variantName: String? = null,

    @field:SerializedName("type_of_fuel")
    val typeOfFuel: String? = null,

    @field:SerializedName("colors")
    val colors: List<ColorsItem?>? = null,

    @field:SerializedName("variant_id")
    val variantId: String? = null,

    @field:SerializedName("seating_capacity")
    val seatingCapacity: Int? = null,

    @field:SerializedName("location")
    val location: String? = null,

    @field:SerializedName("displacement")
    val displacement: String? = null,

    @field:SerializedName("mileage")
    val mileage: String? = null,

   @field:SerializedName("battery")
    val battery: String? = null,

   @field:SerializedName("range")
    val range: String? = null,

   @field:SerializedName("power_ev")
    val powerEv: String? = null,

   @field:SerializedName("charging_time")
    val chargingTime: String? = null,

    var compare: Boolean? = false
)

data class FeaturesItemModel(

    @field:SerializedName("su_name")
    val suName: String? = null,

    @field:SerializedName("features_name")
    val featuresName: String? = null,

    @field:SerializedName("feature_value")
    val featureValue: String? = null
)

data class TaxNameItemModel(

    @field:SerializedName("cost")
    val cost: Double? = null,

    @field:SerializedName("tax_name")
    val taxName: String? = null,

//    @field:SerializedName("tax_id")
//    val taxId: Int? = null
)

data class SpecItemModel(

    @field:SerializedName("features")
    val features: List<FeaturesItemModel?>? = null,

    @field:SerializedName("spec_image")
    val specImage: String? = null,

    @field:SerializedName("spec_id")
    val specId: Int? = null,

    @field:SerializedName("spec_name")
    val specName: String? = null
)

data class ColorsItem(

    @field:SerializedName("variant_color_image_path")
    val variantColorImagePath: String? = null,

    @field:SerializedName("color_id")
    val colorId: String? = null,

    @field:SerializedName("variant_id")
    val variantId: String? = null,

    @field:SerializedName("dual_color_code")
    val dualColorCode: String? = null,

    @field:SerializedName("color_name")
    val colorName: String? = null,

    @field:SerializedName("color_code")
    val colorCode: String? = null,

    @field:SerializedName("variant_color_image")
    val variantColorImage: String? = null
)
