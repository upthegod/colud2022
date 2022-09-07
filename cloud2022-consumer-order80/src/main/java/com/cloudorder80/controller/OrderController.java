package com.cloudorder80.controller;

import com.cloudorder80.pojo.CommonResult;
import com.cloudorder80.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author upgod
 * @description
 * @create 2022-09-2:51
 */
@RestController
public class OrderController {

    private static final String PAYMENT_URL="http://localhost:8001";

    @Autowired
    RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "payment/create", payment, CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

}
