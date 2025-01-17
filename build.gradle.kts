buildscript {

    dependencies {

        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.0")

    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.google.firebase.firebase-perf") version "1.4.2" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
}