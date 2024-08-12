package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class TollFuelUseCounterModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataCounter? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataCounter(

	@field:SerializedName("fuel_count")
	val fuelCount: Int? = null,

	@field:SerializedName("toll_date")
	val tollDate: String? = null,

	@field:SerializedName("toll_count")
	val tollCount: Int? = null,

	@field:SerializedName("fuel_date")
	val fuelDate: Any? = null
)
