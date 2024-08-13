package com.aviansoft.composedemo.API

import com.aviansoft.composedemo.Model.AdvanceSearch.AdvanceCardModel
import com.aviansoft.composedemo.Model.AdvanceSearch.FilterModel
import com.aviansoft.composedemo.Model.AllBMVModel
import com.aviansoft.composedemo.Model.AllCityModel
import com.aviansoft.composedemo.Model.BrandDetailModel
import com.aviansoft.composedemo.Model.BudgetByModelModel
import com.aviansoft.composedemo.Model.ByBudgetModel
import com.aviansoft.composedemo.Model.CarBrandModel
import com.aviansoft.composedemo.Model.CarModuleModel
import com.aviansoft.composedemo.Model.CarModuleSpectsModel
import com.aviansoft.composedemo.Model.CarStageModel
import com.aviansoft.composedemo.Model.CarTypeModel
import com.aviansoft.composedemo.Model.CompareResultModel
import com.aviansoft.composedemo.Model.DeleteUserModel
import com.aviansoft.composedemo.Model.EVBannerModel
import com.aviansoft.composedemo.Model.EVCars.EVBrandModel
import com.aviansoft.composedemo.Model.EVCars.EVCarModelModel
import com.aviansoft.composedemo.Model.FuelPriceModel
import com.aviansoft.composedemo.Model.GetUserCity
import com.aviansoft.composedemo.Model.HeadBannerModel
import com.aviansoft.composedemo.Model.LoginModel
import com.aviansoft.composedemo.Model.Maps.RouteMaps
import com.aviansoft.composedemo.Model.ModelDetailModel
import com.aviansoft.composedemo.Model.NewsNBlogsModel
import com.aviansoft.composedemo.Model.OTP.SendOTPModel
import com.aviansoft.composedemo.Model.OTP.VerifyOTPModel
import com.aviansoft.composedemo.Model.PopolarCityModel
import com.aviansoft.composedemo.Model.SelectModelModel
import com.aviansoft.composedemo.Model.SelectVariantModel
import com.aviansoft.composedemo.Model.Station.EVStationModel
import com.aviansoft.composedemo.Model.Station.FuelStationModel
import com.aviansoft.composedemo.Model.Station.ServiceStationModel
import com.aviansoft.composedemo.Model.Station.StationBrandModel
import com.aviansoft.composedemo.Model.StoryModel
import com.aviansoft.composedemo.Model.TestDrive.BrandModel
import com.aviansoft.composedemo.Model.TestDrive.SendOTPMailModel
import com.aviansoft.composedemo.Model.TestDrive.TransmissionModel
import com.aviansoft.composedemo.Model.TollFuelUseCounterModel
import com.aviansoft.composedemo.Model.TrendingModelModel
import com.aviansoft.composedemo.Model.UpcomingCarModel
import com.aviansoft.composedemo.Model.UpcomingMonthModel
import com.aviansoft.composedemo.Model.UpdateCityModel
import com.aviansoft.composedemo.Model.UpdateProfileModel
import com.aviansoft.composedemo.Model.UserProfileModel
import com.aviansoft.composedemo.Model.WarningLightModel
import com.aviansoft.composedemo.Model.WishAddRemoveModel
import com.aviansoft.composedemo.Model.WishlistModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterface {

    @FormUrlEncoded
    @POST("banners")
    suspend fun getBanner(
        @Field("type") type: String
    ): Response<HeadBannerModel>

    @FormUrlEncoded
    @POST("banners")
    fun getBanner1(
        @Field("type") type: String
    ): Call<HeadBannerModel>

    @POST("car_stage")
    fun getCarStage(): Call<CarStageModel>

    @POST("brand")
    fun getCarBrand(): Call<CarBrandModel>

    @FormUrlEncoded
    @POST("compare_model")
    fun getSelectModel(
        @Field("brand_id") brandId: String, @Field("city_id") cityId: String
    ): Call<SelectModelModel>

    @FormUrlEncoded
    @POST("compare_variant")
    fun getSelectVariant(
        @Field("model_id") modelId: String, @Field("city_id") cityId: String
    ): Call<SelectVariantModel>

    @FormUrlEncoded
    @POST("trending_model")
    fun getTrendingModel(
        @Field("type") type: String, @Header("Authorization") auth: String
    ): Call<TrendingModelModel>

    @FormUrlEncoded
    @POST("budgetBy")
    fun getModelByBudget(
        @Field("min_price") minprice: String,
        @Field("max_price") maxprice: String,
        @Header("Authorization") auth: String
//        @Field("city_id") cityId: String
    ): Call<BudgetByModelModel>


    @POST("electric_Car")
    fun getEVBanner(): Call<EVBannerModel>

    @GET("carModule/{model_name}")
    fun getModelDetail(
        @Path("model_name") modelname: String,
        @Query("city_id") cityId: String,
        @Header("Authorization") auth: String
    ): Call<ModelDetailModel>

    @FormUrlEncoded
    @POST("car_module")
    fun getCarModule(
        @Field("city_id") cityId: String, @Field("model_id") modelId: String
    ): Call<CarModuleModel>

    @FormUrlEncoded
    @POST("car_module_specification")
    fun getCarModuleSpec(
        @Field("city_id") cityId: String,
        @Field("model_id") modelId: String,
        @Field("variant_id") variantId: String
    ): Call<CarModuleSpectsModel>

    @POST("all_model")
    fun getAllModel(): Call<AllBMVModel>

    @FormUrlEncoded
    @POST("login")
    fun getRegisterLogin(
        @Field("contact_no") contact_no: String,
        @Field("custFirstName") first_name: String,
        @Field("custLastName") last_name: String,
        @Field("custEmail") email: String
    ): Call<LoginModel>


    @FormUrlEncoded
    @POST("wish_list")
    fun addRemoveWishlist(
        @Field("model_id") model_id: String,
        @Field("created_date") created_date: String,
        @Header("Authorization") auth: String
    ): Call<WishAddRemoveModel>


    @POST("car_type")
    fun getCarType(): Call<CarTypeModel>

    @POST("price_city")
    fun getAllCities(): Call<AllCityModel>

    @POST("popular_city")
    fun getPopCity(): Call<PopolarCityModel>

    @POST("customer_wishlist")
    fun getWishlist(
        @Header("Authorization") auth: String
    ): Call<WishlistModel>

    @FormUrlEncoded
    @POST("explore_brand")
    fun getExploreBrand(
        @Header("Authorization") auth: String,
        @Field("brand_id") brand_name: String,
        @Field("city_id") cityId: String
    ): Call<BrandDetailModel>

    @FormUrlEncoded
    @POST("compare_answerP")
    fun getCompareResult(
        @Field("variant_id") variantId: String,
        @Field("city_id") cityId: String,
    ): Call<CompareResultModel>

    @POST("upcoming_months")
    fun getUpcomingMonths(): Call<UpcomingMonthModel>

    @FormUrlEncoded
    @POST("upcoming_car_data")
    fun getUpcomingCarModel(
        @Field("within_months") months: String
    ): Call<UpcomingCarModel>

    @FormUrlEncoded
    @POST("advanced_model_card")
    fun getAdvSearchModel(
        @Header("Authorization") auth: String,
        @Field("city_id") city_id: String,
        @Field("budget") budget: String,
        @Field("brand_id") brand_id: String,
        @Field("cartype") cartype: String,
        @Field("fuelType") fuelType: String,
        @Field("engine") engine: String,
        @Field("driveTrain") driveTrain: String,
        @Field("transType") transType: String,
        @Field("safety") safety: String,
        @Field("interior") interior: String,
        @Field("exterior") exterior: String,
        @Field("sort") sort: String,
        @Field("page") page: String,
    ): Call<AdvanceCardModel>

    @POST("advanced_filter")
    fun getAdvanceFilter(): Call<FilterModel>


    @POST("ev_city")
    fun getEVCities(): Call<AllCityModel>

    @POST("fuel_city")
    fun getFuelCities(): Call<AllCityModel>

    @FormUrlEncoded
    @POST("ev_station")
    fun getEVStation(
        @Field("city_id") cityId: String, @Field("page") page: String
    ): Call<EVStationModel>

    @FormUrlEncoded
    @POST("fuel_station")
    fun getFuelStation(
        @Field("city_id") cityId: String, @Field("page") page: String
    ): Call<FuelStationModel>

    @POST("service_station_brands")
    fun getStationBrand(): Call<StationBrandModel>

    @FormUrlEncoded
    @POST("service_station_city")
    fun getFuelCities(
        @Field("brand_id") brand_id: String
    ): Call<AllCityModel>

    @FormUrlEncoded
    @POST("service_station")
    fun getServiceStation(
        @Field("city_id") cityId: String,
        @Field("brand_id") brandId: String,
        @Field("page") page: String
    ): Call<ServiceStationModel>

    @POST("new_car_news_and_blogs")
    fun getStories(): Call<StoryModel>

    @POST("warning_light")
    fun getWarningLight(): Call<WarningLightModel>

    @POST("ev_cars_all_brands")
    fun getEVBrands(): Call<EVBrandModel>

    @FormUrlEncoded
    @POST("ev_cars_by_brand")
    fun getEVByBrand(
        @Header("Authorization") auth: String,
        @Field("city_id") cityId: String,
        @Field("brand_id") brandId: String,
    ): Call<EVCarModelModel>

    @FormUrlEncoded
    @POST("ev_cars_by_budget")
    fun getEVByBudget(
        @Header("Authorization") auth: String,
        @Field("city_id") cityId: String,
        @Field("min_price") minPrice: String,
        @Field("max_price") maxPrice: String,
    ): Call<EVCarModelModel>

    @FormUrlEncoded
    @POST("news_and_blogs")
    fun getNewsAndBlogs(
        @Field("post_type") postType: String
    ): Call<NewsNBlogsModel>


    @POST("get_user")
    fun getUser(
        @Header("Authorization") auth: String
    ): Call<UserProfileModel>

    @FormUrlEncoded
    @POST("update_profile")
    fun updateProfile(
        @Field("profile_pic") profilePic: String,
        @Header("Authorization") auth: String,
        @Field("custFirstName") fname: String,
        @Field("custLastName") lname: String,
        @Field("custEmail") email: String,
        @Field("address_1") address1: String,
        @Field("address_2") address2: String,
    ): Call<UpdateProfileModel>

    @POST("by_budget_list")
    fun getBudget(): Call<ByBudgetModel>


    @FormUrlEncoded
    @POST("add_user_city")
    fun updateCity(
        @Header("Authorization") auth: String, @Field("city_id") cityId: String
    ): Call<UpdateCityModel>

    @POST("get_user_city")
    fun getUserCity(
        @Header("Authorization") auth: String,
    ): Call<GetUserCity>


    @FormUrlEncoded
    @POST("send_otp")
    fun sendOTP(
        @Field("contact_no") mobile: String,
    ): Call<SendOTPModel>


    @FormUrlEncoded
    @POST("verify_otp")
    fun verifyOTP(
        @Field("contact_no") mobile: String,
        @Field("otp") otp: String,
    ): Call<VerifyOTPModel>

    @FormUrlEncoded
    @POST("resend_otp")
    fun resendOTP(
        @Field("contact_no") mobile: String,
    ): Call<VerifyOTPModel>

    @POST("delete_user")
    fun deleteUser(
        @Header("Authorization") auth: String,
    ): Call<DeleteUserModel>

    @POST("test-drive-brand-model")
    fun getBrandModelTestDrive(): Call<BrandModel>

    @FormUrlEncoded
    @POST("get-toll-tax")
    fun getRouteMaps(
        @Field("from_address") from_address: String,
        @Field("from_latitude") from_latitude: String,
        @Field("from_longitude") from_longitude: String,
        @Field("from_country") from_country: String,
        @Field("from_state_name") from_state_name: String,
        @Field("from_state_code") from_state_code: String,
        @Field("from_city_name") from_city_name: String,
        @Field("from_uri") from_uri: String,
        @Field("to_address") to_address: String,
        @Field("to_latitude") to_latitude: String,
        @Field("to_longitude") to_longitude: String,
        @Field("to_country") to_country: String,
        @Field("to_state_name") to_state_name: String,
        @Field("to_state_code") to_state_code: String,
        @Field("to_city_name") to_city_name: String,
        @Field("to_uri") to_uri: String,
        @Field("vehicle_type") vehicle_type: String,
        @Field("mileage") mileage: String,
        @Field("units") units: String,
        @Field("fuel_price") fuel_price: String

    ): Call<RouteMaps>

    @FormUrlEncoded
    @POST("get-fuel-price")
    fun getFuelPrice(
        @Field("city_name") city_name: String
    ): Call<FuelPriceModel>

    @FormUrlEncoded
    @POST("test-drive-transmission")
    fun getTransmission(
        @Field("model_id") model_id: String, @Field("fuel_type") fuel_type: String
    ): Call<TransmissionModel>

    @FormUrlEncoded
    @POST("test-drive-send-mail-otp")
    fun sendMailOTP(
        @Field("email") email: String
    ): Call<SendOTPMailModel>

    @FormUrlEncoded
    @POST("test-drive-verify-mail-otp")
    fun verifyMailOTP(
        @Field("email") email: String, @Field("otp") otp: String
    ): Call<SendOTPMailModel>

    @FormUrlEncoded
    @POST("test-drive-submit")
    fun submitTestDrive(
        @Header("Authorization") auth: String,
        @Field("lat_long") lat_long: String,
        @Field("full_address") full_address: String,
        @Field("email") email: String,
        @Field("name") name: String,
        @Field("brand_id") brand_id: String,
        @Field("model_id") model_id: String,
        @Field("fuel_types") fuel_types: String,
        @Field("transmission") transmission: String,
        @Field("estimated_purchase_date") estimated_purchase_date: String
    ): Call<SendOTPMailModel>

    @FormUrlEncoded
    @POST("update_toll_fuel_count")
    fun updateUseCount(
        @Header("Authorization") auth: String,
        @Field("type") type: String,
        @Field("count") count: String
    ): Call<TollFuelUseCounterModel>

}