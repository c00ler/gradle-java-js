import com.github.gradle.node.npm.task.NpmTask

plugins {
    id("com.github.node-gradle.node") version "7.1.0"
}

node {
    download.set(true)
    version.set("22.17.1")
}

tasks.withType<NpmTask>().configureEach {
    val npmAgentEnvironment = develocity.integration.npm.environment.get()
    environment.putAll(npmAgentEnvironment)
}

val npm_test by tasks.getting {
    dependsOn(tasks.npmInstall)
}

val test by tasks.registering {
    dependsOn(npm_test)
}
