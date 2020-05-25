#### 项目说明：

本博客是学习过程中搭建的项目，为了融合更多知识点，让博客看起来更加高大上，使用了多个框架组合，本项目仅仅是为了练习websocket以及rabbitmq在项目中的使用方式，方便自己更好的理解网络编程以及消息队列。

### 如果您想执行本项目
修改application-vm.yml中的服务器配置信息，然后在cmd/powershell/terminel终端中执行以下语句:
``` java
mvn install // 安装maven依赖
mvn package // 打包本项目至target目录
// 进入target目录，执行以下语句
java -jar wills_blog.jar
``` java

#### 项目结构：
```
eblog
│
├─src
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─markerhub
│  │  │          │  CodeGenerator.java #代码生成
│  │  │          │
│  │  │          ├─common
│  │  │          │  ├─exception #全局异常处理
│  │  │          │  ├─lang
│  │  │          │  └─templates #自定义Freemarker标签封装
│  │  │          │
│  │  │          ├─config #整合配置
│  │  │          ├─controller
│  │  │          ├─entity
│  │  │          │
│  │  │          ├─im #即时群聊
│  │  │          │  ├─handler
│  │  │          │  ├─message
│  │  │          │  ├─server
│  │  │          │  └─vo
│  │  │          │
│  │  │          ├─mapper
│  │  │          ├─schedules #定时任务
│  │  │          │
│  │  │          ├─search #内容搜索引擎与同步
│  │  │          │  ├─model
│  │  │          │  ├─mq
│  │  │          │  └─repository
│  │  │          │
│  │  │          ├─service
│  │  │          │  └─impl
│  │  │          │
│  │  │          ├─shiro #shiro整合
│  │  │          ├─template #定义标签
│  │  │          ├─util
│  │  │          └─vo
│  │  │
│  │  └─resources
│  │      │  application.yml
│  │      ├─mapper
│  │      ├─static
│  │      │  └─res
│  │      │
│  │      └─templates #页面模板

```

#### 技术选型：

* 核心框架：Springboot 2.1.2
* 安全框架：Apache Shiro 1.4
* 持久层框架：Mybatis + mybatis plus 3.2.0
* 页面模板：Freemarker
* 缓存框架：Redis
* 数据库：mysql
* 消息队列：RabbitMq
* 分布式搜索：Elasticsearch 6.4.3
* 双工通讯协议：websocket
* 网络通讯框架：t-io 3.2.5
* 工具集合：hutool 4.1.17

#### 知识要点：
* 基于mybatis plus快速代码生成
* 封装与自定义Freemarker标签
* 使用shiro+redis完成了会话共享
* redis的zset结构完成本周热议排行榜
* t-io+websocket完成即时消息通知和群聊
* 基于rabbitmq+elasticsearch的内容同步与搜索引擎

#### 项目部署：

项目中我们用到了几个中间件，mysql、rabbitmq、elasticsearch。

注意的是，即时群聊功能，一定要再`src/main/resources/static/res/js/im.js`中修改成自己服务器的ip地址，才能连上哈！

数据库sql文件：wills.sql，和pom同一级目录哈



#### 项目截图：

![注册](https://oscimg.oschina.net/oscnet/up-5c6b2b3f4c7b415cfbafea06b6aaf365ab9.png "注册")

![首页](https://oscimg.oschina.net/oscnet/up-22214fea0fc4bc67d29232d3c8004609e4f.png "首页")

![群聊](https://oscimg.oschina.net/oscnet/up-e1e6084e96a61dc22c95e820fa6e40a7940.png "群聊")

![搜索引擎](https://oscimg.oschina.net/oscnet/up-1b61685d1b4f7f2b62b6d917e57da7828f8.png "搜索引擎")

![设置](https://oscimg.oschina.net/oscnet/up-083ca0a70f566c208ce3a7aae00ab502622.png "设置")
