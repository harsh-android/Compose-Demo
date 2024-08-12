package com.aviansoft.composedemo.Model.Station

import com.google.gson.annotations.SerializedName

data class FuelStationModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataFuel? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class FuelStationItem(

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("state_name")
	val stateName: String? = null,

	@field:SerializedName("contact_no")
	val contactNo: String? = null,

	@field:SerializedName("f_station_location")
	val fStationLocation: String? = null,

	@field:SerializedName("f_station_id")
	val fStationId: String? = null,

	@field:SerializedName("f_station_address")
	val fStationAddress: String? = null,

	@field:SerializedName("f_station_name")
	val fStationName: String? = null,

	@field:SerializedName("state_id")
	val stateId: String? = null,

	@field:SerializedName("city_id")
	val cityId: String? = null
)

data class DataFuel(

	@field:SerializedName("last_page")
	val lastPage: Int? = null,

	@field:SerializedName("fuel_station")
	val fuelStation: List<FuelStationItem?>? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null,

	@field:SerializedName("total_record")
	val totalRecord: Int? = null
)
