package com.battlesnake.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Board(
    @JsonProperty("height") val height: Int,
    @JsonProperty("width") val width: Int,
    @JsonProperty("snakes") val snakes: List<Snake>,
    @JsonProperty("food") val food: List<Position>,
)