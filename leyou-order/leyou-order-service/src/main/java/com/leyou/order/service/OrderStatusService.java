package com.leyou.order.service;

import com.leyou.order.vo.CommentsParameter;
import com.leyou.order.vo.OrderStatusMessage;

/**
 * 发送延时消息和评论消息
 */
public interface OrderStatusService {


    /**
     * 发送消息到延时队列
     * @param orderStatusMessage
     */
    void sendMessage(OrderStatusMessage orderStatusMessage);

    /**
     * 发送评论信息
     * @param commentsParameter
     */
    void sendComments(CommentsParameter commentsParameter);
}
