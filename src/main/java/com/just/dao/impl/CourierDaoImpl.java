package com.just.dao.impl;

import com.just.dao.CourierDao;
import com.just.pojo.Courier;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author Crisp
 * @date 2021/4/11
 */
public class CourierDaoImpl implements CourierDao {


    JdbcTemplate jdbcTemplate;
    //JdbcTemplate 是 Spring JDBC 核心包（core）中的核心类，它可以通过配置文件、注解、Java 配置类等形式获取数据库的相关信息，
    // 实现了对 JDBC 开发过程中的驱动加载、连接的开启和关闭、SQL 语句的创建与执行、异常处理、事务处理、数据类型转换等操作的封装。
    // 我们只要对其传入SQL 语句和必要的参数即可轻松进行 JDBC 编程。

    @Override//检查该方法是否是重写方法。如果发现其父类，或者是引用的接口中并没有该方法时，会报编译错误。
    public int addCourier(Courier courier) {
        String sql = "insert courier(id, com, status) values(?, ?, ?)";
        return jdbcTemplate.update(sql, courier.getId(), courier.getDeliverCompany(), courier.getStatus());
        // update用于执行新增、更新、删除等语句；
        // sql：需要执行的 SQL 语句；
        // args 表示需要传入到 SQL 语句中的参数。
    }

    @Override
    public int deleteCourier(Courier courier) {
        String sql = "delete from courier where id = ?";
        return jdbcTemplate.update(sql, courier.getId());
    }

    @Override
    public int updateCourier(Courier courier) {
        String sql = "update courier set com = ?, status = ? where id = ?";
        return jdbcTemplate.update(sql, courier.getDeliverCompany(), courier.getStatus(), courier.getId());
    }

    @Override
    public List<Map<String, Object>> allCourier() {
        String sql = "select * from courier";
        return jdbcTemplate.queryForList(sql);
        //返回一个装有map的list,每一个map是一条记录,map里面的key是字段名
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

