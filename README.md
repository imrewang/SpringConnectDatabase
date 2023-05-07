# SpringConnectDatabase

# 一、简介

使用Spring连接mysql数据库

# 二、部署

创建maven项目，导入相关依赖，是要开发Web项目，但导入Spring Web。这么做主要的原因是Spring Web包含了Spring框架的大部分包，包括core、beans啥的，直接导入web包比较方便省事。

查看pom.xml，IEDA在完成复制粘贴的pom.xml点个小刷新按钮就可以导入了

建表语句

```
CREATE TABLE `courier` (
  `id` int NOT NULL AUTO_INCREMENT,
  `com` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
)
```


# 三、运行截图

运行CourierDaoTest测试时，先addTest时记得改其中的```Courier courier = (Courier)context.getBean("courier01");```



# 四、总结

## （一）Spring框架

Spring框架是一个开源的Java应用程序框架，它提供了一种全面的编程和配置模型，用于现代企业级Java应用程序的开发。Spring框架旨在简化Java开发，并提高应用程序的可维护性和可扩展性。

Spring框架的核心特性包括：

控制反转（IoC）：Spring框架通过IoC容器来管理应用程序中的对象，从而实现对象之间的解耦和松散耦合。

面向切面编程（AOP）：Spring框架提供了AOP框架，允许开发人员在应用程序中使用切面来实现横向关注点的分离。

数据访问：Spring框架提供了JDBC、ORM和事务管理等数据访问技术的支持。

Web开发：Spring框架提供了MVC框架、RESTful Web Services和WebSocket等Web开发技术的支持。

集成：Spring框架提供了与其他框架和技术的集成支持，例如Hibernate、MyBatis、JMS、JMX和Quartz等。

## （二）JdbcTemplate

JdbcTemplate是Spring框架中的一个核心类，它是一个简单而强大的JDBC抽象层，用于简化JDBC操作。JdbcTemplate提供了一种简单、一致和易于使用的编程模型，从而使开发人员能够更加轻松地使用JDBC进行数据库操作。


