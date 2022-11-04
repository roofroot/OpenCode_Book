import org.gradle.internal.impldep.org.yaml.snakeyaml.util.UriEncoder

pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
  }
}
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
    maven ( "file://Users/yuxiu/Documents/maven")
  }
}
rootProject.name = "book"
include(":app")
