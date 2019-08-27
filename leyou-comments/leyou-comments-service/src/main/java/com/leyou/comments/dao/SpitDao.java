package com.leyou.comments.dao;


import com.leyou.comments.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpitDao extends MongoRepository<Spit,String> {
}
