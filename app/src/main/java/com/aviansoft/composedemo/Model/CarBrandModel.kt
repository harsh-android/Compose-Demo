package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarBrandModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemBrand?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemBrand(

	@field:SerializedName("brand_description")
	val brandDescription: String? = null,

	@field:SerializedName("brand_id")
	val brand_id: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_logo")
	val brandLogo: String? = null,

	@field:SerializedName("brand_banner")
	val brandBanner: String? = null
)
