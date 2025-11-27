import org.gradle.api.tasks.Exec

plugins {
    base
}

tasks.register<Exec>("npmInstall") {
    group = "build"
    description = "Install npm dependencies"
    workingDir = projectDir
    commandLine("npm", "install")
}

tasks.register<Exec>("test") {
    group = "verification"
    description = "Run JavaScript tests with Mocha"
    workingDir = projectDir
    commandLine("npm", "test")
    dependsOn("npmInstall")
}

tasks.named("check") {
    dependsOn("test")
}

tasks.named("build") {
    dependsOn("test")
}
