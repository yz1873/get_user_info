FROM java:8
VOLUME /tmp
ADD target/get_user_info-0.0.1-SNAPSHOT.jar /get_user_info-0.0.1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/get_user_info-0.0.1.jar"]