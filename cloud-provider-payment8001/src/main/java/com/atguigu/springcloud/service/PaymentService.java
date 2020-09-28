package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Liangbinchang
 * @date 2020/9/27  17:37
 */

public interface PaymentService {
     int create(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
