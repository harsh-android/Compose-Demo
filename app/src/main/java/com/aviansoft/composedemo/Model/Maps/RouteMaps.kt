package com.aviansoft.composedemo.Model.Maps

import com.google.gson.annotations.SerializedName

data class RouteMaps(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataMaps? = null,

	@field:SerializedName("msg_detail")
	val msgDetail: String? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class Location(

	@field:SerializedName("lng")
	val lng: Any? = null,

	@field:SerializedName("lat")
	val lat: Any? = null
)

data class Units(

	@field:SerializedName("fuelEfficiencyUnit")
	val fuelEfficiencyUnit: String? = null,

	@field:SerializedName("currencyUnit")
	val currencyUnit: String? = null,

	@field:SerializedName("fuelUnit")
	val fuelUnit: String? = null
)

data class Diffs(

	@field:SerializedName("cheapest")
	val cheapest: Double? = null,

	@field:SerializedName("fastest")
	val fastest: Double? = null
)

data class TollsItem(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("cashCostReturn")
	val cashCostReturn: Int? = null,

	@field:SerializedName("tagCostMonthly")
	val tagCostMonthly: Int? = null,

	@field:SerializedName("tagCost")
	val tagCost: Int? = null,

	@field:SerializedName("lng")
	val lng: Double? = null,

	@field:SerializedName("arrival")
	val arrival: Arrival? = null,

	@field:SerializedName("cashCost")
	val cashCost: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("point")
	val point: Point? = null,

	@field:SerializedName("tagCostReturn")
	val tagCostReturn: Int? = null,

	@field:SerializedName("timestamp_localized")
	val timestampLocalized: String? = null,

	@field:SerializedName("road")
	val road: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("currency")
	val currency: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("cashCostMonthly")
	val cashCostMonthly: Any? = null,

	@field:SerializedName("lat")
	val lat: Double? = null,

	@field:SerializedName("timestamp_formatted")
	val timestampFormatted: String? = null
)

data class DirectionsItem(

	@field:SerializedName("duration")
	val duration: Int? = null,

	@field:SerializedName("distance")
	val distance: Int? = null,

	@field:SerializedName("html_instructions")
	val htmlInstructions: String? = null,

	@field:SerializedName("position")
	val position: Position? = null
)

data class RouteItem(

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("location")
	val location: Location? = null
)

data class Duration(

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("value")
	val value: Int? = null
)

data class Geometry(

	@field:SerializedName("coordinates")
	val coordinates: List<Any?>? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Costs(

	@field:SerializedName("licensePlate")
	val licensePlate: Any? = null,

	@field:SerializedName("minimumTollCost")
	val minimumTollCost: Int? = null,

	@field:SerializedName("fuel")
	val fuel: Any? = null,

	@field:SerializedName("tagAndCash")
	val tagAndCash: Int? = null,

	@field:SerializedName("tag")
	val tag: Int? = null,

	@field:SerializedName("cash")
	val cash: Int? = null,

	@field:SerializedName("prepaidCard")
	val prepaidCard: Any? = null
)

data class FuelEfficiency(

	@field:SerializedName("city")
	val city: Int? = null,

	@field:SerializedName("hwy")
	val hwy: Int? = null,

	@field:SerializedName("units")
	val units: String? = null,

	@field:SerializedName("fuelUnit")
	val fuelUnit: String? = null
)

data class DataMaps(

	@field:SerializedName("summary")
	val summary: Summary? = null,

	@field:SerializedName("routes")
	val routes: List<RoutesItem?>? = null,

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class FuelPrice(

	@field:SerializedName("currency")
	val currency: String? = null,

	@field:SerializedName("units")
	val units: String? = null,

	@field:SerializedName("value")
	val value: Any? = null,

	@field:SerializedName("fuelUnit")
	val fuelUnit: String? = null
)

data class RoutesItem(

	@field:SerializedName("summary")
	val summary: Summary? = null,

	@field:SerializedName("costs")
	val costs: Costs? = null,

	@field:SerializedName("directions")
	val directions: List<DirectionsItem?>? = null,

	@field:SerializedName("herePath")
	val herePath: List<Any?>? = null,

	@field:SerializedName("tolls")
	val tolls: List<TollsItem?>? = null,

	@field:SerializedName("polyline")
	val polyline: String? = null
)

data class Arrival(

	@field:SerializedName("distance")
	val distance: Any? = null,

	@field:SerializedName("time")
	val time: String? = null
)

data class Share(

	@field:SerializedName("prefix")
	val prefix: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("client")
	val client: String? = null,

	@field:SerializedName("uuid")
	val uuid: String? = null,

	@field:SerializedName("timestamp")
	val timestamp: String? = null
)

data class Point(

	@field:SerializedName("geometry")
	val geometry: Geometry? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class Summary(

	@field:SerializedName("departureTime")
	val departureTime: String? = null,

	@field:SerializedName("rates")
	val rates: Rates? = null,

	@field:SerializedName("countries")
	val countries: List<String?>? = null,

	@field:SerializedName("units")
	val units: Units? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("fuelEfficiency")
	val fuelEfficiency: FuelEfficiency? = null,

	@field:SerializedName("route")
	val route: List<RouteItem?>? = null,

	@field:SerializedName("vehicleDescription")
	val vehicleDescription: String? = null,

	@field:SerializedName("fuelPrice")
	val fuelPrice: FuelPrice? = null,

	@field:SerializedName("currency")
	val currency: String? = null,

	@field:SerializedName("share")
	val share: Share? = null,

	@field:SerializedName("departure_time")
	val departure_Time: String? = null,

	@field:SerializedName("vehicleType")
	val vehicleType: String? = null,

	@field:SerializedName("duration")
	val duration: Duration? = null,

	@field:SerializedName("distance")
	val distance: Distance? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("hasTolls")
	val hasTolls: Boolean? = null,

	@field:SerializedName("diffs")
	val diffs: Diffs? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("hasExpressTolls")
	val hasExpressTolls: Boolean? = null
)

data class Distance(

	@field:SerializedName("metric")
	val metric: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("value")
	val value: Int? = null
)

data class Rates(

	@field:SerializedName("FJD")
	val fJD: Double? = null,

	@field:SerializedName("MXN")
	val mXN: Double? = null,

	@field:SerializedName("SCR")
	val sCR: Double? = null,

	@field:SerializedName("CDF")
	val cDF: Double? = null,

	@field:SerializedName("BBD")
	val bBD: Double? = null,

	@field:SerializedName("GTQ")
	val gTQ: Double? = null,

	@field:SerializedName("CLP")
	val cLP: Double? = null,

	@field:SerializedName("HNL")
	val hNL: Double? = null,

	@field:SerializedName("UGX")
	val uGX: Double? = null,

	@field:SerializedName("ZAR")
	val zAR: Double? = null,

	@field:SerializedName("TND")
	val tND: Double? = null,

	@field:SerializedName("BSD")
	val bSD: Double? = null,

	@field:SerializedName("SLL")
	val sLL: Double? = null,

	@field:SerializedName("SDG")
	val sDG: Double? = null,

	@field:SerializedName("IQD")
	val iQD: Double? = null,

	@field:SerializedName("CUP")
	val cUP: Double? = null,

	@field:SerializedName("TWD")
	val tWD: Double? = null,

	@field:SerializedName("RSD")
	val rSD: Double? = null,

	@field:SerializedName("DOP")
	val dOP: Double? = null,

	@field:SerializedName("MYR")
	val mYR: Double? = null,

	@field:SerializedName("XOF")
	val xOF: Double? = null,

	@field:SerializedName("GEL")
	val gEL: Double? = null,

	@field:SerializedName("UYU")
	val uYU: Double? = null,

	@field:SerializedName("MAD")
	val mAD: Double? = null,

	@field:SerializedName("CVE")
	val cVE: Double? = null,

	@field:SerializedName("AZN")
	val aZN: Double? = null,

	@field:SerializedName("OMR")
	val oMR: Double? = null,

	@field:SerializedName("KES")
	val kES: Double? = null,

	@field:SerializedName("SEK")
	val sEK: Double? = null,

	@field:SerializedName("BTN")
	val bTN: Double? = null,

	@field:SerializedName("UAH")
	val uAH: Double? = null,

	@field:SerializedName("GNF")
	val gNF: Double? = null,

	@field:SerializedName("MZN")
	val mZN: Double? = null,

	@field:SerializedName("ARS")
	val aRS: Double? = null,

	@field:SerializedName("QAR")
	val qAR: Double? = null,

	@field:SerializedName("IRR")
	val iRR: Double? = null,

	@field:SerializedName("CNY")
	val cNY: Double? = null,

	@field:SerializedName("THB")
	val tHB: Double? = null,

	@field:SerializedName("UZS")
	val uZS: Double? = null,

	@field:SerializedName("XPF")
	val xPF: Double? = null,

	@field:SerializedName("BDT")
	val bDT: Double? = null,

	@field:SerializedName("LYD")
	val lYD: Double? = null,

	@field:SerializedName("KWD")
	val kWD: Double? = null,

	@field:SerializedName("PHP")
	val pHP: Double? = null,

	@field:SerializedName("RUB")
	val rUB: Double? = null,

	@field:SerializedName("PYG")
	val pYG: Double? = null,

	@field:SerializedName("ISK")
	val iSK: Double? = null,

	@field:SerializedName("JMD")
	val jMD: Double? = null,

	@field:SerializedName("BEF")
	val bEF: Int? = null,

	@field:SerializedName("COP")
	val cOP: Double? = null,

	@field:SerializedName("MKD")
	val mKD: Double? = null,

	@field:SerializedName("USD")
	val uSD: Int? = null,

	@field:SerializedName("DZD")
	val dZD: Double? = null,

	@field:SerializedName("PAB")
	val pAB: Double? = null,

	@field:SerializedName("SGD")
	val sGD: Double? = null,

	@field:SerializedName("ETB")
	val eTB: Double? = null,

	@field:SerializedName("KGS")
	val kGS: Double? = null,

	@field:SerializedName("VEF")
	val vEF: Double? = null,

	@field:SerializedName("LAK")
	val lAK: Double? = null,

	@field:SerializedName("BND")
	val bND: Double? = null,

	@field:SerializedName("XAF")
	val xAF: Double? = null,

	@field:SerializedName("LRD")
	val lRD: Double? = null,

	@field:SerializedName("CHF")
	val cHF: Double? = null,

	@field:SerializedName("HRK")
	val hRK: Double? = null,

	@field:SerializedName("ALL")
	val aLL: Double? = null,

	@field:SerializedName("VES")
	val vES: Double? = null,

	@field:SerializedName("ZMW")
	val zMW: Double? = null,

	@field:SerializedName("TZS")
	val tZS: Double? = null,

	@field:SerializedName("VND")
	val vND: Double? = null,

	@field:SerializedName("AUD")
	val aUD: Double? = null,

	@field:SerializedName("ILS")
	val iLS: Double? = null,

	@field:SerializedName("GHS")
	val gHS: Double? = null,

	@field:SerializedName("GYD")
	val gYD: Double? = null,

	@field:SerializedName("BOB")
	val bOB: Double? = null,

	@field:SerializedName("KHR")
	val kHR: Double? = null,

	@field:SerializedName("MDL")
	val mDL: Double? = null,

	@field:SerializedName("IDR")
	val iDR: Double? = null,

	@field:SerializedName("KYD")
	val kYD: Double? = null,

	@field:SerializedName("BWP")
	val bWP: Double? = null,

	@field:SerializedName("TRY")
	val tRY: Double? = null,

	@field:SerializedName("LBP")
	val lBP: Double? = null,

	@field:SerializedName("JOD")
	val jOD: Double? = null,

	@field:SerializedName("AED")
	val aED: Double? = null,

	@field:SerializedName("HKD")
	val hKD: Double? = null,

	@field:SerializedName("RWF")
	val rWF: Double? = null,

	@field:SerializedName("EUR")
	val eUR: Double? = null,

	@field:SerializedName("LSL")
	val lSL: Double? = null,

	@field:SerializedName("DKK")
	val dKK: Double? = null,

	@field:SerializedName("CAD")
	val cAD: Double? = null,

	@field:SerializedName("BGN")
	val bGN: Double? = null,

	@field:SerializedName("MMK")
	val mMK: Double? = null,

	@field:SerializedName("MUR")
	val mUR: Double? = null,

	@field:SerializedName("NOK")
	val nOK: Double? = null,

	@field:SerializedName("SYP")
	val sYP: Double? = null,

	@field:SerializedName("RON")
	val rON: Double? = null,

	@field:SerializedName("LKR")
	val lKR: Double? = null,

	@field:SerializedName("NGN")
	val nGN: Double? = null,

	@field:SerializedName("CRC")
	val cRC: Double? = null,

	@field:SerializedName("CZK")
	val cZK: Double? = null,

	@field:SerializedName("PKR")
	val pKR: Double? = null,

	@field:SerializedName("XCD")
	val xCD: Double? = null,

	@field:SerializedName("ANG")
	val aNG: Double? = null,

	@field:SerializedName("HTG")
	val hTG: Double? = null,

	@field:SerializedName("BHD")
	val bHD: Double? = null,

	@field:SerializedName("KZT")
	val kZT: Double? = null,

	@field:SerializedName("SRD")
	val sRD: Double? = null,

	@field:SerializedName("SZL")
	val sZL: Double? = null,

	@field:SerializedName("SAR")
	val sAR: Double? = null,

	@field:SerializedName("TTD")
	val tTD: Double? = null,

	@field:SerializedName("MVR")
	val mVR: Double? = null,

	@field:SerializedName("AFN")
	val aFN: Double? = null,

	@field:SerializedName("INR")
	val iNR: Double? = null,

	@field:SerializedName("AWG")
	val aWG: Double? = null,

	@field:SerializedName("KRW")
	val kRW: Double? = null,

	@field:SerializedName("NPR")
	val nPR: Double? = null,

	@field:SerializedName("JPY")
	val jPY: Double? = null,

	@field:SerializedName("MNT")
	val mNT: Double? = null,

	@field:SerializedName("AOA")
	val aOA: Double? = null,

	@field:SerializedName("PLN")
	val pLN: Double? = null,

	@field:SerializedName("GBP")
	val gBP: Double? = null,

	@field:SerializedName("BYN")
	val bYN: Double? = null,

	@field:SerializedName("HUF")
	val hUF: Double? = null,

	@field:SerializedName("BIF")
	val bIF: Double? = null,

	@field:SerializedName("MWK")
	val mWK: Double? = null,

	@field:SerializedName("MGA")
	val mGA: Double? = null,

	@field:SerializedName("BZD")
	val bZD: Double? = null,

	@field:SerializedName("BAM")
	val bAM: Double? = null,

	@field:SerializedName("EGP")
	val eGP: Double? = null,

	@field:SerializedName("NAD")
	val nAD: Double? = null,

	@field:SerializedName("NIO")
	val nIO: Double? = null,

	@field:SerializedName("PEN")
	val pEN: Double? = null,

	@field:SerializedName("NZD")
	val nZD: Double? = null,

	@field:SerializedName("TMT")
	val tMT: Double? = null,

	@field:SerializedName("CLF")
	val cLF: Double? = null,

	@field:SerializedName("BRL")
	val bRL: Double? = null
)

data class Position(

	@field:SerializedName("lng")
	val lng: Double? = null,

	@field:SerializedName("lat")
	val lat: Double? = null
)

data class Meta(

	@field:SerializedName("tx")
	val tx: Int? = null,

	@field:SerializedName("customerId")
	val customerId: String? = null,

	@field:SerializedName("client")
	val client: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("userId")
	val userId: String? = null
)
