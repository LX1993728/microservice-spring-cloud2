#基于哪个镜像
FROM java:8
#将本地文件夹挂载到当前容器
VOLUME /tmp
# 复制文件到容器
ADD target/eureka-compose-test-1.0-SNAPSHOT.jar /eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]
#声明需要暴露的端口
EXPOSE 8761