package org.example.madlife

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform