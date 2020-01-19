package com.lnzz.service.impl;

import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayRequest;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.lnzz.service.IPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * ClassName：PayServiceImpl
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/17 16:18
 * @Description:
 */
@Slf4j
@Service
public class PayServiceImpl implements IPayService {
    @Override
    public void create(String orderId, BigDecimal amount) {
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wxd898fcb01713c658");
        wxPayConfig.setMchId("1483469312");
        wxPayConfig.setMchKey("098F6BCD4621D373CADE4E832627B4F6");
        wxPayConfig.setNotifyUrl("http://127.0.0.1");

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);

        PayRequest request = new PayRequest();
        request.setOrderName("4559066-最好的支付sdk");
        request.setOrderId("123456789123458");
        request.setOrderAmount(0.01);
        request.setPayTypeEnum(BestPayTypeEnum.WXPAY_NATIVE);

        PayResponse response = bestPayService.pay(request);
        log.info("response={}", response);
    }
}
