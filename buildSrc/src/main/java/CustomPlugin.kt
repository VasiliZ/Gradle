import org.gradle.api.Plugin
import org.gradle.api.Project
import java.io.File

open class CustomPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        target.tasks.create("addDependencies") {
          target.dependencies.apply {
              add("implementation","com.squareup.retrofit2:retrofit:2.9.0")
              add("implementation","androidx.core:core-ktx:1.7.0")
              add("implementation","androidx.appcompat:appcompat:1.5.1")
              add("implementation","com.google.android.material:material:1.6.1")
              add("implementation","androidx.constraintlayout:constraintlayout:2.1.4")
              add("implementation","androidx.navigation:navigation-fragment-ktx:2.5.0")
              add("implementation","androidx.navigation:navigation-ui-ktx:2.5.0")
          }
        }.dependsOn("build")
    }
}