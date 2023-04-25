package com.rachel.plugins

import com.rachel.routes.butterfly
import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    
    routing {
        butterfly()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
