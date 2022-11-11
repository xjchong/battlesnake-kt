package com.battlesnake.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Snake(
    @JsonProperty("id") val id: String,
    @JsonProperty("name") val name: String,
    @JsonProperty("health") var health: Int,
    @JsonProperty("body") val body: List<Position>,
    @JsonProperty("head") var head: Position,
    @JsonProperty("length") var length: Int,
    @JsonProperty("shout") var shout: String = "",
)