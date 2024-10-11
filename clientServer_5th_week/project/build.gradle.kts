import com.google.protobuf.gradle.id

plugins {
    id("java")
    id("com.google.protobuf").version("0.9.4")
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    //gRPC 사용에 필요한 의존성 설치
    /**compile group: 'io.grpc', name: 'grpc-stub', version: '1.35.0'
     * 이러한 형식은 Gardle 3.0 이후로 쓰이지 않음*/
    implementation("io.grpc:grpc-protobuf:1.56.0")
    implementation("io.grpc:grpc-stub:1.56.0")

    implementation("com.google.protobuf:protobuf-java-util:3.25.3")
    compileOnly("com.google.protobuf:protobuf-java:3.25.3")
    runtimeOnly("io.grpc:grpc-netty-shaded:1.56.0")

    // grpc 컴파일을 위해 javax.annotation-api 추가
    implementation("javax.annotation:javax.annotation-api:1.3.2")

    //maria db jdbc 드라이버 추가
    // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
    implementation("com.mysql:mysql-connector-j:8.3.0")
    implementation("org.mariadb.jdbc:mariadb-java-client:3.4.1")

    //SLF4J 오류로 인해 api와 로깅 구현체 추가
    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("ch.qos.logback:logback-classic:1.4.12")
}

protobuf{
    protoc {
        artifact = "com.google.protobuf:protoc:3.24.0"
    }
    plugins{
        id("grpc"){
            artifact="io.grpc:protoc-gen-grpc-java:1.35.0"
        }
    }
    generateProtoTasks {
        all().forEach{
            it.plugins{
                id("grpc")
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}