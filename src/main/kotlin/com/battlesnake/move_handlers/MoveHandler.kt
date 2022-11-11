package com.battlesnake.move_handlers

import com.battlesnake.models.MoveRequest
import com.battlesnake.models.MoveResponse

interface MoveHandler {

    fun handle(moveRequest: MoveRequest): MoveResponse
}