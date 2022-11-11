package com.battlesnake.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.battlesnake.models.Board
import com.battlesnake.models.Game
import com.battlesnake.models.Snake

@JsonIgnoreProperties(ignoreUnknown = true)
data class MoveRequest(
    @JsonProperty("game") val game: Game,
    @JsonProperty("turn") val turn: Int,
    @JsonProperty("board") val board: Board,
    @JsonProperty("you") val you: Snake,
)
