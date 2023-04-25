package com.rachel.routes

import com.rachel.data.model.Butterfly
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASEURL = "http://192.168.0.16:8080"
private val butterflies = listOf(
    Butterfly("Zara","pretty","$BASEURL/butterflies/buttfour.jpg"),
    Butterfly("Tiffy", "Tall","$BASEURL/butterflies/buttone.jpg"),
    Butterfly("Rachel", "My fave","$BASEURL/butterflies/buttthree.jpg"),
    Butterfly("Faith", "Wird", "$BASEURL/butterflies/butttwo.jpg")
)

fun Route.butterfly(){
    get("/butter"){
        call.respond(
            HttpStatusCode.OK,

            butterflies.random()
        )
    }
}