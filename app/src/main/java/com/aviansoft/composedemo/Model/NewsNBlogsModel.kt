package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class NewsNBlogsModel(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: DataNewsNBlog? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class RecentPostItem(

	@field:SerializedName("author_name")
	val authorName: String? = null,

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("content_details")
	val contentDetails: String? = null,

	@field:SerializedName("post_type")
	val postType: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("content_image")
	val contentImage: String? = null,

	@field:SerializedName("days_passed")
	val daysPassed: String? = null,

	@field:SerializedName("author_image")
	val authorImage: Any? = null,

	@field:SerializedName("day_of_week")
	val dayOfWeek: String? = null
)

data class PopularPostItem(

	@field:SerializedName("author_name")
	val authorName: String? = null,

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("category_name")
	val categoryName: String? = null,

	@field:SerializedName("content_details")
	val contentDetails: String? = null,

	@field:SerializedName("post_type")
	val postType: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("content_image")
	val contentImage: String? = null,

	@field:SerializedName("days_passed")
	val daysPassed: String? = null,

	@field:SerializedName("author_image")
	val authorImage: Any? = null,

	@field:SerializedName("day_of_week")
	val dayOfWeek: String? = null
)

data class DataNewsNBlog(

	@field:SerializedName("recent_post")
	val recentPost: List<RecentPostItem?>? = null,

	@field:SerializedName("popular_post")
	val popularPost: List<PopularPostItem?>? = null
)
