plugins {
  `kotlin-dsl`
}

dependencies {
  compileOnly(libs.android.gradle)
  compileOnly(libs.compose.gradle)
  compileOnly(libs.kotlin.gradle)
  compileOnly(libs.ksp.gradle)
}

gradlePlugin {
  plugins {
    register("lixhubre.application") {
      id = "lixhubre.application"
      implementationClass = "ApplicationConventionPlugin"
    }
    
    register("lixhubre.library") {
      id = "lixhubre.library"
      implementationClass = "LibraryConventionPlugin"
    }
    
    register("lixhubre.compose") {
      id = "lixhubre.compose"
      implementationClass = "ComposeConventionPlugin"
    }
  }
}