package com.aviansoft.composedemo.Model.AdvanceSearch

import com.google.gson.annotations.SerializedName

data class AdvanceCardModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataAdvModel? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class ModelCardItem(

	@field:SerializedName("min_ex_showroom_price")
	val minExShowroomPrice: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("variant_count")
	val variantCount: Int? = null,

	@field:SerializedName("model_image")
	val modelImage: String? = null,

	@field:SerializedName("rating_value")
	val ratingValue: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null,

	@field:SerializedName("max_ex_showroom_price")
	val maxExShowroomPrice: String? = null,

	@field:SerializedName("rating_type_name")
	val ratingTypeName: String? = null,

	@field:SerializedName("wishlist")
	var wishlist: Boolean? = null
)

data class DataAdvModel(

	@field:SerializedName("model_card")
	val modelCard: List<ModelCardItem?>? = null,

	@field:SerializedName("last_page")
	val lastPage: Int? = null,

	@field:SerializedName("search_filter")
	val searchFilter: List<String?>? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null,

	@field:SerializedName("total_record")
	val totalRecord: Int? = null
)
