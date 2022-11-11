package com.battlesnake

import RandomMoveHandler
import com.fasterxml.jackson.databind.SerializationFeature
import com.battlesnake.models.InfoResponse
import com.battlesnake.models.MoveRequest
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.jackson.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

@Suppress("unused", "unused_parameter")
fun main(args: Array<String>) {
    val environment = applicationEngineEnvironment {
        module { module() }

        connector {
            host = "0.0.0.0"
            port = 8080
        }
    }

    embeddedServer(Netty, environment).start()
}

@Suppress("unused", "unused_parameter") // Referenced in application.conf.
fun Application.module(testing: Boolean = false) {
    install(CallLogging)
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }

    routing {
        get("/") {
            call.respond(HttpStatusCode.OK, InfoResponse(
                apiversion = "1",
                author = "anonymous",
                color = "#3281a8",
                head = "default",
                tail = "default"
            ))
        }

        post("/start") {
            call.respond(HttpStatusCode.OK)
        }

        post("/move") {
            val moveRequest = call.receive<MoveRequest>()
            val moveHandler = RandomMoveHandler()
            val moveResponse = moveHandler.handle(moveRequest)

            call.respond(HttpStatusCode.OK, moveResponse)
        }

        post("/end") {
            call.respond(HttpStatusCode.OK)
        }
    }
}