**将docker:build插件命令绑定到package 简化操作**
**在maven全局文件中添加Docker账户信息，实现推送镜像**

构建镜像：使用mvn package 取代mvn package docker:build

推送镜像：mvn docker:push