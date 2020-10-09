package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Liangbinchang
 * @date 2020/9/29  14:23
 */

@Service
public class PaymentService {

    public String paymentInfo_Ok(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_Ok.id " + id + "\t";
    }

    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + "paymentInfo_TimeOut.id " + id + "\t" + "耗时：" + timeNumber;
    }
}
