package com.aviansoft.composedemo.Model.EVCars

import com.google.gson.annotations.SerializedName

data class EVBrandModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemEVBrand?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemEVBrand(

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_logo")
	val brandLogo: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)
