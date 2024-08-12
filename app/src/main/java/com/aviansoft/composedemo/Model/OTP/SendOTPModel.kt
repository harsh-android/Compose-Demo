package com.aviansoft.composedemo.Model.OTP

import com.google.gson.annotations.SerializedName


data class SendOTPModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataSendOTP? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataSendOTP(

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("request_id")
	val requestId: String? = null
)
