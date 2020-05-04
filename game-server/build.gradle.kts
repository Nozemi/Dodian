import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val springVersion: String by project

plugins {
    application
    kotlin("jvm")
    id("org.springframework.boot") version "2.0.5.RELEASE"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
}

application {
    mainClassName = "net.dodian.Server"
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    runtimeOnly("com.h2database:h2:1.4.200")

    annotationProcessor("org.projectlombok:lombok:1.18.10")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor:${springVersion}")

    implementation("com.google.code.gson:gson:2.8.6")
    implementation("org.springframework.boot:spring-boot-starter-web:${springVersion}")
    implementation("org.springframework.boot:spring-boot-starter-security:${springVersion}")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:${springVersion}")

    implementation("io.netty:netty-all:4.1.8.Final")
    implementation("com.google.guava:guava:28.0-jre")
    implementation("javax.xml.bind:jaxb-api:2.3.0")

    implementation("org.javassist:javassist:3.26.0-GA")
    implementation("org.apache.commons:commons-compress:1.18")
    implementation("log4j:log4j:1.2.17")

    compileOnly("org.projectlombok:lombok:1.18.10")

    testImplementation("org.springframework.boot:spring-boot-starter-test:${springVersion}")

    implementation("io.reactivex.rxjava3:rxjava:3.0.3")
    implementation(kotlin("stdlib-jdk8"))

}

tasks.register<JavaExec>("runServer") {
    group = "dodian-game"
    description = "Run the Dodian game server."

    classpath = sourceSets["main"].runtimeClasspath
    main = "net.dodian.Server"
}

tasks.register<JavaExec>("runServerProd") {
    group = "dodian-game"
    description = "Run the Dodian game server in production mode."

    args(" -Dspring.profiles.active=prod")
    classpath = sourceSets["main"].runtimeClasspath
    main = "net.dodian.Server"
}
repositories {
    mavenCentral()
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}