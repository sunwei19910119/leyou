package com.leyou.item.bo;

import lombok.Data;

/**
 * 秒杀参数设置
 */
@Data
public class SeckillParameter {
    /**
     * 要秒杀的sku id
     */
    private Long id;

    /**
     * 秒杀开始时间
     */
    private String startTime;

    /**
     * 秒杀结束时间
     */
    private String endTime;

    /**
     * 参与秒杀的商品数量
     */
    private Integer count;

    /**
     * 折扣
     */
    private double  discount;


    @Override
    public String toString() {
        return "SeckillParameter{" +
                "id=" + id +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", count=" + count +
                ", discount=" + discount +
                '}';
    }
}
