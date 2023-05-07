package com.just.pojo;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Crisp
 * @date 2021/4/11
 */
public class CourierTest {
    @Test
    public void courierTest() {

        //加载bean配置文件
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //ConfigurableApplicationContext 是 Spring 应用程序上下文的接口之一，它是 ApplicationContext 接口的子接口。
        //ConfigurableApplicationContext 接口扩展了 ApplicationContext 接口，
        // 使得在启动 Spring 应用程序时，我们可以以编程方式向 Spring 容器注册 Bean 定义并管理 Bean 实例。

        //获取Courier对象
        Courier courier01 = (Courier)context.getBean("courier01");
        //getBean() 是 ApplicationContext 接口中定义的一个方法，可以从 Spring 容器中获取一个已经注册的 Bean。
        // 在 ConfigurableApplicationContext 接口中也可以使用该方法。

        System.out.println(courier01.getStatus());
        System.out.println(courier01);
    }
}

