package com.cloudpayment8001.controller;

import com.cloudpayment8001.pojo.CommonResult;
import com.cloudpayment8001.pojo.Payment;
import com.cloudpayment8001.service.PaymentService;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author upgod
 * @description
 * @create 2022-09-23:34
 */
@RestController
public class PaymentController {
    @Autowired
    PaymentService paymentService;


    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        System.out.println(i);
        if (i==1){
            return new CommonResult<>(564,"插入成功",i);
        }else {
            return new CommonResult<>(444,"插入失败",null);
        }
    }


    @GetMapping("/payment/get/{id}")
    public CommonResult getById(@PathVariable("id")Long id){
        Payment byId = paymentService.getById(id);
        System.out.println(byId);

        if (byId==null){
            return new CommonResult<>(444,"查询失败",null);
        }else {
            return new CommonResult<>(564,"查询成功",byId);
        }
    }
}
