package com.leyou.comments.dao;


import com.leyou.comments.pojo.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CommentDao extends MongoRepository<Review,String> {

    /**
     * 分页查询
     * @param spuId
     * @param pageable
     * @return
     */
    Page<Review> findReviewBySpuid(String spuId, Pageable pageable);
}
