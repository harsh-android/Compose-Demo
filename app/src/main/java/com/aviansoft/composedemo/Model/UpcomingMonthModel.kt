package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class UpcomingMonthModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataMonth? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataMonth(

	@field:SerializedName("months")
	val months: List<String?>? = null
)
