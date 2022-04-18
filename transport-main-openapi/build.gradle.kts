plugins {
    kotlin("jvm")
}

group = "ru.res"
version = "0.1"

val junitVersion: String by project
val jacksonVersion: String by project

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation("com.fasterxml.jackson.core:jackson-annotations:$jacksonVersion")


    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}