// Top-level build file where you can add configuration options common to all sub-projects/modules.
import org.jetbrains.kotlin.config.JvmAnalysisFlags.useIR
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

ext {
  ext["compileSdkVersion"] = 30
  ext["buildToolsVersion"] = "30.0.3"
  ext["minSdkVersion"] = 16
  ext["targetSdkVersion"] = 30
  ext["versionCode"] = 1
  ext["versionName"] = "1.0.0"
  ext["camerax_view"] = "1.0.0-alpha28"
  ext["camerax_version"] = "1.1.0-alpha08"
  ext["camera_core_version"] = "1.0.0-rc04"
  ext["core_ktx"] = "1.8.0"
  // ucrop
  ext["androidx_exifinterface_version"] = "1.3.3"
  ext["androidx_transition_version"] = "1.4.1"
  // glide
  ext["glide_version"] = "4.12.0"
  ext["coroutines_version"] = "1.3.9"
  ext["kotlin_version"] = "1.7.0"
  ext["compose_version"] = "1.2.1"
}
plugins {
  id("com.android.application") version ("8.0.0-alpha02") apply false
  id("com.android.library") version ("8.0.0-alpha02") apply false
  id("org.jetbrains.kotlin.android") version ("1.7.0") apply false
}

