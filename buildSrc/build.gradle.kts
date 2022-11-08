import org.gradle.kotlin.dsl.`kotlin-dsl`

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin{
    plugins {
        create("CustomPlugin"){
            id = "com.github.rtyvz.myapplication"
            implementationClass = "CustomPlugin"
            version = "1.1.1"
        }
    }
}