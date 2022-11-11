package com.battlesnake.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Position(
    @JsonProperty("x") val x: Int,
    @JsonProperty("y") val y: Int,
)