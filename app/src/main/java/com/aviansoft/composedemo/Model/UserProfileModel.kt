package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class UserProfileModel(

    @field:SerializedName("msg")
    val msg: String? = null,

    @field:SerializedName("code")
    val code: Int? = null,

    @field:SerializedName("data")
    val data: DataUser? = null,

    @field:SerializedName("status")
    val status: Boolean? = null
)

data class DataUser(

    @field:SerializedName("pincode")
    val pincode: Any? = null,

//	@field:SerializedName("whatsapp_status")
//	val whatsappStatus: Boolean? = null,

    @field:SerializedName("address_1")
    val address1: String? = null,

    @field:SerializedName("address_2")
    val address2: String? = null,

    @field:SerializedName("profile_pic")
    val profilePic: String? = null,

    @field:SerializedName("last_name")
    val lastName: String? = null,

    @field:SerializedName("created_at")
    val createdAt: String? = null,

    @field:SerializedName("consent_signed")
    val consentSigned: Int? = null,

    @field:SerializedName("updated_at")
    val updatedAt: String? = null,

    @field:SerializedName("contact_no")
    val contactNo: String? = null,

    @field:SerializedName("state_id")
    val stateId: String? = null,

    @field:SerializedName("customer_id")
    val customerId: String? = null,

    @field:SerializedName("first_name")
    val firstName: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("country_id")
    val countryId: String? = null,

    @field:SerializedName("city_id")
    val cityId: String? = null,

    @field:SerializedName("status")
    val status: Int? = null,

    @field:SerializedName("fuel_count")
    val fuelCount: Int? = null,

    @field:SerializedName("toll_count")
    val tollCount: Int? = null

)
