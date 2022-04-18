rootProject.name = "subscription_service"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        val kotestVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("multiplatfrom") version kotlinVersion apply false
        id("io.kotest.multiplatform") version kotestVersion apply false
    }
}
include("common")
include("transport-main-openapi")
