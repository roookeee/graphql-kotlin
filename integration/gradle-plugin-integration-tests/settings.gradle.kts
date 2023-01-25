rootProject.name = "gradle-plugin-integration-tests"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../../gradle/libs.versions.toml"))
        }
    }
}

// composite graphql-kotlin library build
includeBuild("../..")

// client generator integration tests
include(":client-custom-scalars-jackson-it")
include(":client-custom-scalars-kotlinx-it")
include(":client-jacoco-it")
include(":client-polymorphic-types-jackson-it")
include(":client-polymorphic-types-kotlinx-it")
include(":client-skip-include-it")

project(":client-custom-scalars-jackson-it").projectDir = file("client-generator/custom-scalars-jackson")
project(":client-custom-scalars-kotlinx-it").projectDir = file("client-generator/custom-scalars-kotlinx")
project(":client-jacoco-it").projectDir = file("client-generator/jacoco")
project(":client-polymorphic-types-jackson-it").projectDir = file("client-generator/polymorphic-types-jackson")
project(":client-polymorphic-types-kotlinx-it").projectDir = file("client-generator/polymorphic-types-kotlinx")
project(":client-skip-include-it").projectDir = file("client-generator/skip-include")

// download sdl task integration tests
include(":download-sdl-kotlin-it")
include(":download-sdl-groovy-it")

project(":download-sdl-kotlin-it").projectDir = file("download-sdl/kotlin")
project(":download-sdl-groovy-it").projectDir = file("download-sdl/groovy")

// introspect schema task integration tests
include(":introspection-kotlin-it")
include(":introspection-groovy-it")

project(":introspection-kotlin-it").projectDir = file("introspection/kotlin")
project(":introspection-groovy-it").projectDir = file("introspection/groovy")

// sdl generator integration tests