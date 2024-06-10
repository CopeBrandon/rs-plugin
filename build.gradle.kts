plugins {
    java
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.runelite.net")
    }
    mavenCentral()
}

val runeLiteVersion = "latest.release"

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    compileOnly(group= "net.runelite", name="client", version = "latest.release")
    compileOnly("org.projectlombok:lombok:1.18.30")


    testImplementation("junit:junit:4.12")
    testImplementation(group = "net.runelite", name="client", version = "latest.release")
    testImplementation(group = "net.runelite", name="jshell", version =  "latest.release")
}

group = "com.plugintest"
version = "1.0-SNAPSHOT"

tasks{
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.release.set(11)
    }
}
