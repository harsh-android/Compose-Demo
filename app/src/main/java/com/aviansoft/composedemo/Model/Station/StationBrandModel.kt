package com.aviansoft.composedemo.Model.Station

import com.google.gson.annotations.SerializedName

data class StationBrandModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItem(

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)
