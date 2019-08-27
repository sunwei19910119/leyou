package com.leyou.seckill.mapper;

import com.leyou.item.pojo.SeckillGoods;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface SeckillMapper extends Mapper<SeckillGoods> {
}
