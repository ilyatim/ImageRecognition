plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
    id("dependencies") version "0.0.1" apply false
    /**
     * To check new versions of dependencies, you need to perform the following algorithm of actions.
     * - Open gradle in the side menu on the right
     * - Click "execute gradle task" (You need to click on the funny elephant icon on the left side of the window)
     * - Type the command "checkDependencyUpdates" to run the script
     * - After the script has worked, information on more current versions
     * of dependencies will be displayed in the build
     */
    id("name.remal.check-dependency-updates") version "1.5.0"
}

buildscript {
    val hiltVersion = "2.42"
    val kotlinVersion = "1.7.0"
    val gradleVersion = "7.2.0"
    dependencies {
        //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        //classpath("com.android.tools.build:gradle:$gradleVersion")
        //classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        //classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}