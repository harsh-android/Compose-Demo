package com.aviansoft.composedemo.Model.Station

import com.google.gson.annotations.SerializedName

data class EVStationModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataEVStation? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataEVStation(

	@field:SerializedName("ev_station")
	val evStation: List<EvStationItem?>? = null,

	@field:SerializedName("last_page")
	val lastPage: Int? = null,

	@field:SerializedName("current_page")
	val currentPage: Int? = null,

	@field:SerializedName("total_record")
	val totalRecord: Int? = null
)

data class EvStationItem(

	@field:SerializedName("ev_station_name")
	val evStationName: String? = null,

	@field:SerializedName("ev_station_id")
	val evStationId: String? = null,

	@field:SerializedName("ev_station_charging_voltage")
	val evStationChargingVoltage: String? = null,

	@field:SerializedName("ev_station_location")
	val evStationLocation: String? = null,

	@field:SerializedName("ev_station_charging_port_type")
	val evStationChargingPortType: String? = null,

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("ev_station_charging_rate")
	val evStationChargingRate: String? = null,

	@field:SerializedName("state_name")
	val stateName: String? = null,

	@field:SerializedName("ev_station_car_capacity")
	val evStationCarCapacity: String? = null,

	@field:SerializedName("ev_station_contact_number")
	val evStationContactNumber: String? = null,

	@field:SerializedName("ev_station_charging_slots")
	val evStationChargingSlots: String? = null,

	@field:SerializedName("state_id")
	val stateId: String? = null,

	@field:SerializedName("city_id")
	val cityId: String? = null,

	@field:SerializedName("ev_station_address")
	val evStationAddress: String? = null
)
