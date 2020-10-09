package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Liangbinchang
 * @date 2020/9/29  14:28
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService service;


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("payment/hystrix/ok/{id}")
    public String paymentInfo_Ok(@PathVariable("id") Integer id) {
        String result = service.paymentInfo_Ok(id);
        return result;
    }

    @GetMapping("payment/hystrix/timeOut/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = service.paymentInfo_TimeOut(id);
        return result;
    }
}
