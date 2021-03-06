package com.lnzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName：PayMallApplication
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/17 15:02
 * @Description:
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lnzz.dao")
public class PayMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayMallApplication.class, args);
    }

}
