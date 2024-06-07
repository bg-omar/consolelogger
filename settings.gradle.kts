rootProject.name = "ConsoleLogger"

pluginManagement {
        repositories {
            maven("https://www.jetbrains.com/intellij-repository/releases")
            maven("https://www.jetbrains.com/intellij-repository/snapshots")
            maven("https://cache-redirector.jetbrains.com/intellij-dependencies")
            gradlePluginPortal()
            mavenCentral()
        }
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")