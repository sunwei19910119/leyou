package com.leyou.repository;

import com.leyou.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 文档操作
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
