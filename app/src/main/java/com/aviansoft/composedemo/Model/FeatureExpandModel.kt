package com.aviansoft.composedemo.Model

import com.google.gson.annotations.SerializedName

data class FeatureExpandModel(

    val specImage: String? = null,
    val specId: Int? = null,
    val scId: Int? = null,
    val specName: String? = null,
    val details : List<FeaturesDeatilModel>

)

data class FeaturesDeatilModel (

    val variantId: Int? = null,
    val modelName: String? = null,
    val specId: Int? = null,
    val suName: String? = null,
    val brandName: String? = null,
    val variantName: String? = null,
    val featuresName: String? = null,
    val modelId: Int? = null,
    val featureValue: String? = null,
    val fvId: Int? = null,
    val brandId: Int? = null
)