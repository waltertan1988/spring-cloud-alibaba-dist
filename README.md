# spring-cloud-alibaba-dist
spring-cloud-alibaba学习

## 版本说明
* 使用的Spring Cloud Alibaba的版本为2.2.6.RELEASE
* Spring Cloud Alibaba各组件对应的版本，参看[这里](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

## 模块划分
* spring-cloud-alibaba-dubbo-api：服务的api接口
* spring-cloud-alibaba-dubbo-provider：服务提供者
* spring-cloud-alibaba-dubbo-consumer：服务消费者

## 部署
### 启动nacos 
默认账号密码都是nacos

```text
startup.cmd -m standalone
```
          
### nacos控制台上添加应用的配置
这里对nacos配置的层次定义为： 
* namespace：项目组名称，如xxx电商项目组 
* group：项目组下某个应用中心的名称，如商品中心、订单中心等
* dataId：应用中心下某个子应用进程名称+环境，如dubbo-provider-dev.properties 

#### 创建namespace 
* 名称：spring-cloud-alibaba-study 
* id：f95d527a-f6d7-484a-8638-1095815130ae

#### 添加服务提供者的应用配置 
* dataId：dubbo-provider-dev.properties 
* group：spring-cloud-alibaba-dist 
* namespace：spring-cloud-alibaba-study 
* 格式：properties 
```text
dubbo.protocol.name=dubbo
dubbo.protocol.port=20880

logging.level.root=INFO

management.endpoints.web.exposure.include=*

spring.application.name=dubbo-provider

# 使用nacos作为注册中心
spring.cloud.nacos.discovery.namespace=f95d527a-f6d7-484a-8638-1095815130ae
spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848

# 使用zookeeper作为注册中心
#spring.cloud.zookeeper.discovery.register=true
#spring.cloud.zookeeper.connect-string=localhost:2181
```

#### 添加服务消费者的应用配置 
* dataId：dubbo-consumer-dev.properties 
* group：spring-cloud-alibaba-dist 
* namespace：spring-cloud-alibaba-study
* 格式：properties 
```text
dubbo.cloud.subscribed-services=dubbo-provider
dubbo.consumer.check=false

logging.level.root=INFO

management.endpoints.web.exposure.include=*

server.port=7080

# 使用nacos作为注册中心（仅订阅服务）
spring.cloud.nacos.discovery.namespace=f95d527a-f6d7-484a-8638-1095815130ae
spring.cloud.nacos.discovery.register-enabled=false
spring.cloud.nacos.discovery.server-addr=127.0.0.1:8848

# 使用zookeeper作为注册中心（仅订阅服务）
#spring.cloud.zookeeper.discovery.register=false
#spring.cloud.zookeeper.connect-string=localhost:2181
```