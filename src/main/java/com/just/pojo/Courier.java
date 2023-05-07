package com.just.pojo;

/**
 * @author Crisp
 * @date 2021/4/11
 */
public class Courier {
    /**
     * id : 物流单号
     * deliverCompany : 物流公司
     * status ： 物流状态
     */
    int id;
    String deliverCompany;
    String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliverCompany() {
        return deliverCompany;
    }

    public void setDeliverCompany(String deliverCompany) {
        this.deliverCompany = deliverCompany;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    //检查该方法是否是重写方法。如果发现其父类，或者是引用的接口中并没有该方法时，会报编译错误。
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", deliverCompany='" + deliverCompany + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

