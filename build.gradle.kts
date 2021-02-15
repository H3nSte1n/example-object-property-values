
plugins {
    kotlin("jvm") version "1.4.30"
}

group = "example application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.30")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.1.3")
}
