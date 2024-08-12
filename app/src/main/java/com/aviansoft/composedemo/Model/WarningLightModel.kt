package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class WarningLightModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataItemWL?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItemWL(

	@field:SerializedName("wl_heading")
	val wlHeading: String? = null,

	@field:SerializedName("indications")
	val indications: List<String?>? = null,

	@field:SerializedName("precautions")
	val precautions: List<String?>? = null,

	@field:SerializedName("wl_video")
	val wlVideo: String? = null,

	@field:SerializedName("wl_id")
	val wlId: String? = null,

	@field:SerializedName("wl_name")
	val wlName: String? = null,

	@field:SerializedName("wl_display_position")
	val wlDisplayPosition: String? = null,

	@field:SerializedName("wl_icon")
	val wlIcon: String? = null
)
