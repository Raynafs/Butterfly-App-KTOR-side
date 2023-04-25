package com.rachel.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Butterfly(
    val name: String,
    val description: String,
    val imageUrl: String
)