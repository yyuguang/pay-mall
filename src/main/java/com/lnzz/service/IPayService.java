package com.lnzz.service;


import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import com.lnzz.pojo.PayInfo;

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
     * @param bestPayTypeEnum
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知处理
     *
     * @param notifyData
     * @return
     */
    String asyncNotify(String notifyData);


    /**
     * 查询支付记录（通过订单号）
     *
     * @param orderId
     * @return
     */
    PayInfo queryByOrderId(String orderId);


}
