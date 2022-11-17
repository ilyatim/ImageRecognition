plugins {
    id("com.android.application") version "7.2.1" apply false
    id("com.android.library") version "7.2.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
    /**
     * To check new versions of dependencies, you need to perform the following algorithm of actions.
     * - Open gradle in the side menu on the right
     * - Click "execute gradle task" (You need to click on the funny elephant icon on the left side of the window)
     * - Type the command "checkDependencyUpdates" to run the script
     * - After the script has worked, information on more current versions
     * of dependencies will be displayed in the build
     */
    id("name.remal.check-dependency-updates") version "1.5.0"
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0" apply false
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
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