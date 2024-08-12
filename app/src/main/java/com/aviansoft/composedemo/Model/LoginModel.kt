package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class 	LoginModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataLogin? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataLogin(

	@field:SerializedName("login_status")
	val loginStatus: Boolean? = null,

	@field:SerializedName("contact_no")
	val contactNo: String? = null,

	@field:SerializedName("address_1")
	val address1: String? = null,

	@field:SerializedName("address_2")
	val address2: String? = null,

	@field:SerializedName("last_name")
	val lastName: String? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("first_name")
	val firstName: String? = null,

	@field:SerializedName("email")
	val email: String? = null,

	@field:SerializedName("token")
	val token: String? = null,

	@field:SerializedName("profile_pic")
	val profilePic: String? = null,

	@field:SerializedName("selected_city_id")
	val selectedCityId: String? = null,

	@field:SerializedName("selected_city_name")
	val selectedCityName: String? = null
)
