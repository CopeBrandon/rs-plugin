plugins {
	id 'java'
}

repositories {
	mavenLocal()
	maven {
		url = 'https://repo.runelite.net'
	}
	mavenCentral()
}

def runeLiteVersion = 'latest.release'

dependencies {
	annotationProcessor()

	compileOnly group: 'net.runelite', name:'client', version: runeLiteVersion

	compileOnly 'org.projectlombok:lombok:1.18.30'
	annotationProcessor 'org.projectlombok:lombok:1.18.30'

	testImplementation 'junit:junit:4.12'
	testImplementation group: 'net.runelite', name:'client', version: runeLiteVersion
	testImplementation group: 'net.runelite', name:'jshell', version: runeLiteVersion
}

group = 'com.plugintest'
version = '1.0-SNAPSHOT'

tasks.withType(JavaCompile) {
	options.encoding = 'UTF-8'
	options.release.set(11)
}
