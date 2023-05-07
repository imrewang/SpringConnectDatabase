package com.just.dao;

import com.just.pojo.Courier;

import java.util.List;
import java.util.Map;

/**
 * @author Crisp
 * @date 2021/4/11
 */
public interface CourierDao {
    /**
     * 添加一则快递信息
     * @param courier 添加的快递信息
     * @return 数据库更改的条数
     */
    int addCourier(Courier courier);

    /**
     * 删除一则快递信息
     * @param courier 需要删除的快递
     * @return 数据库更改的条目数量
     */
    int deleteCourier(Courier courier);

    /**
     * 更新一则快递信息
     * @param courier 需要更新的快递信息
     * @return 数据库更新的条目数量
     */
    int updateCourier(Courier courier);

    /**
     * 获取数据库中所有的快递信息
     * @return 所有快递信息键值对组成的列表
     */
    List<Map<String, Object>> allCourier();
}


