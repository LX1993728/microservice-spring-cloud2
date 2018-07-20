FROM java:8
MAINTAINER lx1993728 2652790899@qq.com
VOLUME /tmp
ADD eureka-server-docker3-0.0.1-SNAPSHOT.jar /eureka-server-docker3.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server-docker3.jar"]