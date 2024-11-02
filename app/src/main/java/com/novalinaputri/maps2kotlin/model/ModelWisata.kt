package com.novalinaputri.maps2kotlin.model

data class ModelWisata(
    var image : Int,
    var nama : String,
    var daerah : String,
    var deskripsi : String,
    val latitude: Double,
    val longitude: Double
)

