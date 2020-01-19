package com.lnzz.service;


import java.math.BigDecimal;

/**
 * ClassName：IPayService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/17 16:17
 * @Description:
 */
public interface IPayService {
    /**
     * 创建/发起支付
     *
     * @param orderId
     * @param amount
     */
    void create(String orderId, BigDecimal amount);
}
