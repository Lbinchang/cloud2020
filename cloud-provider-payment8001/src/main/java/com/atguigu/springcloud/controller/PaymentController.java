package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Liangbinchang
 * @date 2020/9/27  17:41
 */


@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        if (result > 0)
            return new CommonResult(200, "插入成功！", result);
        else
            return new CommonResult(444, "失败！", result);
    }

    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable Long id) {

        Payment result = paymentService.getPaymentById(id);
        if (result != null)
            return new CommonResult(200, "查询成功！", result);
        else
            return new CommonResult(444, "失败！", result);
    }
}
