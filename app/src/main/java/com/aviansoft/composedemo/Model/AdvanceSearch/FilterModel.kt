package com.aviansoft.composedemo.Model.AdvanceSearch

import com.google.gson.annotations.SerializedName

data class FilterModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataFilter? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class ByFuelTypeItem(

	@field:SerializedName("model_count")
	val modelCount: Int? = null,

	@field:SerializedName("fuel_type")
	val fuelType: String? = null
)

data class BySafetyItem(

	@field:SerializedName("safety")
	val safety: String? = null,

	@field:SerializedName("model_count")
	val modelCount: Int? = null
)

data class ByExteriorItem(

	@field:SerializedName("exterior")
	val exterior: String? = null,

	@field:SerializedName("model_count")
	val modelCount: Int? = null
)

data class ByTransTypeItem(

	@field:SerializedName("model_count")
	val modelCount: Int? = null,

	@field:SerializedName("transition_type")
	val transitionType: String? = null
)

data class ByInteriorItem(

	@field:SerializedName("model_count")
	val modelCount: Int? = null,

	@field:SerializedName("interior")
	val interior: String? = null
)

data class DataFilter(

	@field:SerializedName("by_engine")
	val byEngine: List<ByEngineItem?>? = null,

	@field:SerializedName("by_brand")
	val byBrand: List<ByBrandItem?>? = null,

	@field:SerializedName("by_fuelType")
	val byFuelType: List<ByFuelTypeItem?>? = null,

	@field:SerializedName("by_budget")
	val byBudget: List<ByBudgetItem?>? = null,

	@field:SerializedName("by_driveTrain")
	val byDriveTrain: List<ByDriveTrainItem?>? = null,

	@field:SerializedName("by_exterior")
	val byExterior: List<ByExteriorItem?>? = null,

	@field:SerializedName("by_transType")
	val byTransType: List<ByTransTypeItem?>? = null,

	@field:SerializedName("bt_carType")
	val btCarType: List<BtCarTypeItem?>? = null,

	@field:SerializedName("by_safety")
	val bySafety: List<BySafetyItem?>? = null,

	@field:SerializedName("by_interior")
	val byInterior: List<ByInteriorItem?>? = null
)

data class ByBrandItem(

	@field:SerializedName("model_count")
	val modelCount: Int? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)

data class ByEngineItem(

	@field:SerializedName("engine_range")
	val engineRange: String? = null,

	@field:SerializedName("model_count")
	val modelCount: Int? = null
)

data class ByBudgetItem(

	@field:SerializedName("price_in_words")
	val priceInWords: String? = null,

	@field:SerializedName("model_count")
	val modelCount: Int? = null,

	@field:SerializedName("price_range")
	val priceRange: String? = null
)

data class BtCarTypeItem(

	@field:SerializedName("car_type_name")
	val carTypeName: String? = null,

	@field:SerializedName("car_type_id")
	val carTypeId: String? = null,

	@field:SerializedName("car_type_image")
	val carTypeImage: String? = null,

	@field:SerializedName("mode_count")
	val modeCount: Int? = null
)

data class ByDriveTrainItem(

	@field:SerializedName("drive_train")
	val driveTrain: String? = null,

	@field:SerializedName("model_count")
	val modelCount: Int? = null
)
