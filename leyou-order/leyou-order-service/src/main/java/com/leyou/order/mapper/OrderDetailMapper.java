package com.leyou.order.mapper;

import com.leyou.order.pojo.OrderDetail;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

import java.util.List;

@Repository
public interface OrderDetailMapper extends Mapper<OrderDetail>, InsertListMapper<OrderDetail> {

}
