package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class ByBudgetModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemBudgetBy?>? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemBudgetBy(

	@field:SerializedName("price_in_words")
	val priceInWords: String? = null,

	@field:SerializedName("price_range")
	val priceRange: String? = null
)
