package com.leyou.item.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
import java.util.Date;


@Data
@Table(name = "tb_seckill_sku")
public class SeckillGoods {

    @Id
    @KeySql(useGeneratedKeys=true)
    private Long id;
    /**
     * 秒杀商品的id
     */
    private Long skuId;
    /**
     * 秒杀开始时间
     */
    private Date startTime;
    /**
     * 秒杀结束时间
     */
    private Date endTime;
    /**
     * 秒杀价格
     */
    private Double seckillPrice;
    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 是否可以秒杀
     */
    private Boolean enable;

    /**
     * 秒杀库存
     */
    @JsonIgnore
    @Transient
    private Integer stock;

    @JsonIgnore
    @Transient
    private Integer seckillTotal;


    @Override
    public String toString() {
        return "SeckillGoods{" +
                "id=" + id +
                ", skuId=" + skuId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", seckillPrice=" + seckillPrice +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", enable=" + enable +
                ", stock=" + stock +
                ", seckillTotal=" + seckillTotal +
                '}';
    }
}
