plugins {
    id("java")
    id("com.gradleup.shadow") version "8.3.0"
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "me.levitate"
version = "1.0.0"

repositories {
    mavenCentral()

    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.aikar.co/content/groups/aikar/")
    maven("https://jitpack.io")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.4-R0.1-SNAPSHOT")
    compileOnly("com.github.xLevitate:Quill:1.2.8-beta")

    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")

    // Database
    compileOnly("com.github.NivixX.NDatabase:ndatabase-api:1.0.0")
}

tasks {
    shadowJar {
        minimize()
    }

    runServer {
        minecraftVersion("1.20.4")

        downloadPlugins {
            url("https://dev.bukkit.org/projects/vault/files/3007470/download")

            github("xLevitate", "Quill", "v1.1.8-beta", "Quill-1.1.8-beta.jar")
        }
    }
}