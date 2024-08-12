package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CompareResultModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataCR? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class CategoryItem(

	@field:SerializedName("spec_image")
	val specImage: String? = null,

	@field:SerializedName("specification_name")
	val specificationName: String? = null,

	@field:SerializedName("name")
	val name: List<NameItem?>? = null
)

data class NameItem(

	@field:SerializedName("feature_name")
	val featuresName: String? = null,

	@field:SerializedName("feature_value")
	val featureValue: List<String?>? = null
)

data class BasicDetailsItem(

	@field:SerializedName("feature_name")
	val featureName: String? = null,

	@field:SerializedName("feature_value")
	val featureValue: List<String?>? = null
)

data class SpecificationCategoryItem(

	@field:SerializedName("specification_catagory_name")
	val specificationCatagoryName: String? = null,

	@field:SerializedName("category")
	val category: List<CategoryItem?>? = null
)

data class DataCR(

	@field:SerializedName("basic_details")
	val basicDetails: List<BasicDetailsItem?>? = null,

//	@field:SerializedName("card_data")
//	val cardData: List<CardDataItem?>? = null,

	@field:SerializedName("specification_category")
	val specificationCategory: List<SpecificationCategoryItem?>? = null
)

//data class CardDataItem(
//
//	@field:SerializedName("variant_id")
//	val variantId: String? = null,
//
//	@field:SerializedName("model_name")
//	val modelName: String? = null,
//
//	@field:SerializedName("variant_image")
//	val variantImage: String? = null,
//
//	@field:SerializedName("model_image")
//	val modelImage: String? = null,
//
//	@field:SerializedName("brand_name")
//	val brandName: String? = null,
//
//	@field:SerializedName("variant_name")
//	val variantName: String? = null,
//
//	@field:SerializedName("model_id")
//	val modelId: String? = null,
//
//	@field:SerializedName("brand_id")
//	val brandId: String? = null
//)
