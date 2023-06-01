package com.example.esg_adventure.model

import com.google.gson.annotations.SerializedName

data class Fruit(
   @SerializedName("name") val name: String,
   @SerializedName("id") val id: Int,
   @SerializedName("family") val family: String,
   @SerializedName("order") val order: String,
   @SerializedName("genus") val genus: String,
   @SerializedName("nutritions") val nutritions: Nutrition
)

data class Nutrition(
    @SerializedName("calories") val calories: Int,
    @SerializedName("fat") val fat: Double,
    @SerializedName("sugar") val sugar: Double,
    @SerializedName("carbohydrates") val carbohydrates: Double,
    @SerializedName("protein") val protein: Double
)