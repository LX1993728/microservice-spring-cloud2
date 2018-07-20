***使用idea插件Docker Integration自动构建运行镜像***

步骤1：编写Dockerfile在项目根目录
步骤2: 在云主机的docker启动项中配置 tcp服务

` -H  unix:///var/run/docker.sock  -H tcp://0.0.0.0:2375`

步骤3：在idea File - setting - Build，Execution，Deployment - Docker中
配置云主机的tcp连接地址

步骤4: 在Run- Edit Configurations- 点击"+"添加一个Docker Deployment 进行配置 然后apply

运行即可



