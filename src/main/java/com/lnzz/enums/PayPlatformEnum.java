package com.lnzz.enums;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import lombok.Getter;

/**
 * ClassName：PayPlatform
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/20 11:19
 * @Description:支付类型枚举
 */
@Getter
public enum PayPlatformEnum {

    /**
     * 支付宝
     */
    ALIPAY(1),
    /**
     * 微信
     * 微信
     */
    WX(2),
    ;

    /**
     * code码
     */
    Integer code;

    PayPlatformEnum(Integer code) {
        this.code = code;
    }

    public static PayPlatformEnum getByBestPayTypeEnum(BestPayTypeEnum bestPayTypeEnum) {
        for (PayPlatformEnum payPlatformEnum : PayPlatformEnum.values()) {
            if (bestPayTypeEnum.getPlatform().name().equals(payPlatformEnum.name())) {
                return payPlatformEnum;
            }
        }
        throw new RuntimeException("错误的支付平台: " + bestPayTypeEnum.name());
    }
}
