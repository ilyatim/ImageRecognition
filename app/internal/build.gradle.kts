plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.unfixedbo1t.internal"
version = "0.0.1"

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins.register("dependencies") {
        id = "dependencies"
        implementationClass = "com.unfixedbo1t.internal.InternalPlugin"
    }
}