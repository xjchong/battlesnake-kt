import com.battlesnake.models.MoveRequest
import com.battlesnake.models.MoveResponse
import com.battlesnake.move_handlers.MoveHandler

class RandomMoveHandler : MoveHandler {

    override fun handle(moveRequest: MoveRequest): MoveResponse {
        return MoveResponse(move = listOf("left", "right", "up", "down").random())
    }
}