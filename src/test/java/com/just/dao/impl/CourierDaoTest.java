package com.just.dao.impl;

import com.just.pojo.Courier;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class CourierDaoTest {

    /**
     * 添加测试
     */
    @Test
    public void addTest() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourierDaoImpl courierDao = (CourierDaoImpl)context.getBean("courierDao");
        Courier courier = (Courier)context.getBean("courier01");
        System.out.println("添加" + courierDao.addCourier(courier));
    }

    /**
     * 删除测试
     */
    @Test
    public void delTest() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourierDaoImpl courierDao = (CourierDaoImpl)context.getBean("courierDao");
        Courier courier = (Courier)context.getBean("courier03");
        System.out.println("删除" + courierDao.deleteCourier(courier));
    }



    /**
     * 更新测试
     */
    @Test
    public void updateTest() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourierDaoImpl courierDao = (CourierDaoImpl)context.getBean("courierDao");
        Courier courier = (Courier)context.getBean("courier03");
        courier.setDeliverCompany("圆通");
        System.out.println("更新" + courierDao.updateCourier(courier));
    }


    /**
     * 列出所有物流信息
     */
    @Test
    public void listTest() {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourierDaoImpl courierDao = (CourierDaoImpl)context.getBean("courierDao");
        System.out.println(courierDao.allCourier());
    }




}
