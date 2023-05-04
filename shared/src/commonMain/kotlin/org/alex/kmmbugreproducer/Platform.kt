package org.alex.kmmbugreproducer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform