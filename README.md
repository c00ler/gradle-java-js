# gradle-java-js

A simple Gradle project with java and javascript modules

## Project Structure

This is a multi-module Gradle project using Kotlin DSL:

- **java-module**: Java module with JUnit 5 tests
- **js-module**: JavaScript module with Mocha tests

## Building and Testing

Run all tests:

```bash
./gradlew test
```

Run tests for individual modules:

```bash
./gradlew :java-module:test
./gradlew :js-module:test
```
