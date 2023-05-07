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
