import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "com.tutuland"
version = "1.0"

buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.2.10"

    repositories {
        mavenCentral()
    }
    
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlin_version))
    }
    
}

apply {
    plugin("java")
    plugin("kotlin")
}

val kotlin_version: String by extra

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlinModule("stdlib-jdk8", kotlin_version))
    testImplementation("org.jetbrains.kotlin", "kotlin-test-junit")
    testImplementation("org.amshove.kluent", "kluent", "1.33")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

