grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {
    inherits("global") {
    }
    log "warn"
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }
    dependencies {
    }
    plugins {
        build ":tomcat:7.0.50", {
            export = false
        }
        runtime ":hibernate:3.6.10.7", {
            export = false
        }
    }
}
