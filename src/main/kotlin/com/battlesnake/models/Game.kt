package com.battlesnake.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Game(
    @JsonProperty("id") val id: String,
    @JsonProperty("timeout") val timeout: Int,
)