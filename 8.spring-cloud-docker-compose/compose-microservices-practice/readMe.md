
步骤1： 配置Docker Integration插件信息
步骤2：在父项目根目录的POM文件下 执行 mvn  clean package 便可打包
上传每个微服务的镜像
步骤3：在Docker Deployment中配置docker-compose.yml的位置
执行 Run 即可