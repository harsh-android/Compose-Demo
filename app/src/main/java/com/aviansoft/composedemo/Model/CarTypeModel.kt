package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarTypeModel(

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

	@field:SerializedName("ct_id")
	val ctId: String? = null,

	@field:SerializedName("ct_name")
	val ctName: String? = null,

	@field:SerializedName("ct_image")
	val ctImage: String? = null,

	@field:SerializedName("priority")
	val priority: Int? = null
)
