package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class UpdateProfileModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<String>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
