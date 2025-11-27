import com.github.gradle.node.npm.task.NpmTask

plugins {
    base
    id("com.github.node-gradle.node") version "7.1.0"
}

node {
    download.set(true)
    version.set("20.19.5")
}

val npmTest = tasks.register<NpmTask>("npmTest") {
    args.set(listOf("test"))
    dependsOn(tasks.npmInstall)
}

tasks.named("check") {
    dependsOn(npmTest)
}

tasks.named("build") {
    dependsOn(npmTest)
}
