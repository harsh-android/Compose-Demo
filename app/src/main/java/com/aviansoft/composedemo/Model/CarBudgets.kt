package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class CarBudgets(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemBrand?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemBudget(

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("min_price")
	val minPrice: String? = null,

	@field:SerializedName("max_price")
	val maxPrice: String? = null,

)
