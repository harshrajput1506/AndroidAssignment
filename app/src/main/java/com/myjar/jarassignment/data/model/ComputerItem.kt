package com.myjar.jarassignment.data.model

import com.google.gson.annotations.SerializedName


data class ComputerItem(
    val `data`: ItemData?,
    val id: String,
    val name: String
)

data class ItemData(
    @SerializedName("CPU model") val cpuModel: String?,
    @SerializedName("Capacity") val capacity1: String?,
    @SerializedName("Case Size") val caseSize: String?,
    @SerializedName("Color") val color1: String?,
    @SerializedName("Description") val description: String?,
    @SerializedName("Generation") val generation1: String?,
    @SerializedName("Hard disk size")val hardDiskSize: String?,
    @SerializedName("Price") val price1: String?,
    @SerializedName("Screen size") val screenSize: Double?,
    @SerializedName("Strap Colour ") val strapColour: String?,
    @SerializedName("capacity") val capacity: String?,
    @SerializedName("capacity GB")val capacityGB: Int?,
    @SerializedName("color") val color: String?,
    @SerializedName("generation") val generation: String?,
    @SerializedName("price") val price: Double?,
    @SerializedName("year") val year: Int?
)


