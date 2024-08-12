package com.aviansoft.composedemo.Model.Station

import com.google.gson.annotations.SerializedName

data class ServiceStationModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataService? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class ServiceStationItem(

	@field:SerializedName("s_station_emil")
	val sStationEmil: String? = null,

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("s_station_name")
	val sStationName: String? = null,

	@field:SerializedName("s_station_address")
	val sStationAddress: String? = null,

	@field:SerializedName("state_name")
	val stateName: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("s_station_location")
	val sStationLocation: String? = null,

	@field:SerializedName("s_station_contact_number")
	val sStationContactNumber: String? = null,

	@field:SerializedName("s_station_id")
	val sStationId: String? = null,

	@field:SerializedName("brand_id")
	val brandId: String? = null
)

data class DataService(

	@field:SerializedName("service_station")
	val serviceStation: List<ServiceStationItem?>? = null,

	@field:SerializedName("last_page")
	val lastPage: Int? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null,

	@field:SerializedName("total_record")
	val totalRecord: Int? = null
)
