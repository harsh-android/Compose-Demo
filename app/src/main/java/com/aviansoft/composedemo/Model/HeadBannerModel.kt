package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class HeadBannerModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemHeadBanner?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemHeadBanner(

	@field:SerializedName("banner_id")
	val bannerId: String? = null,

	@field:SerializedName("btn_link")
	val btnLink: String? = null,

	@field:SerializedName("bc_name")
	val bcName: String? = null,

	@field:SerializedName("bc_id")
	val bcId: String? = null,

	@field:SerializedName("model_id")
	val modelId: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("model_name")
	val modelName: String? = null,

	@field:SerializedName("banner_image")
	val bannerImage: String? = null,

	@field:SerializedName("banner_description")
	val bannerDescription: String? = null,

	@field:SerializedName("btn_text")
	val btnText: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null,

	@field:SerializedName("banner_heading")
	val bannerHeading: String? = null
)
