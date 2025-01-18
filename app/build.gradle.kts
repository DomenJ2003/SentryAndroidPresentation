plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}


android {
    val apiKey: String = project.findProperty("SENTRY_KEY") as String? ?: ""

    namespace = "com.example.sentrypresentation"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.sentrypresentation"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        manifestPlaceholders["sentryKey"] = ""
    }

    buildTypes {
        release {
            buildConfigField("String", "API_KEY", "\"$apiKey\"")
            manifestPlaceholders["sentryKey"] = apiKey
                isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            buildConfigField("String", "SENTRY_URL", "\"${apiKey}\"")
            manifestPlaceholders["sentryKey"] = apiKey

        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }
    buildFeatures {
        buildConfig = true
    }
}


dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation("io.sentry:sentry-android-ndk:6.27.0")
    implementation("io.github.cdimascio:dotenv-kotlin:6.4.1")
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}