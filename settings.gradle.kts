rootProject.name = "eureka-server"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.5.0")
}

buildscript {
    repositories {
        if (org.apache.tools.ant.taskdefs.condition.Os.isFamily(org.apache.tools.ant.taskdefs.condition.Os.FAMILY_WINDOWS)) {
            maven {
                url = uri(System.getenv("NEXUS_LOCAL"))
            }
        } else {
            mavenCentral()
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        if (org.apache.tools.ant.taskdefs.condition.Os.isFamily(org.apache.tools.ant.taskdefs.condition.Os.FAMILY_WINDOWS)) {
            maven {
                url = uri(System.getenv("NEXUS_LOCAL"))
            }
        } else {
            mavenCentral()
        }
    }
}
