package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class WishAddRemoveModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: Boolean? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)
