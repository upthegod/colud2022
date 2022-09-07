package com.cloudpayment8001;

import com.cloudpayment8001.mapper.PaymentMapper;
import com.cloudpayment8001.pojo.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author upgod
 * @description
 * @create 2022-09-21:37
 */
@SpringBootTest
public class Mybatis {
    @Autowired
    PaymentMapper paymentMapper;

    @Test
    public void test(){
        paymentMapper.insertSelective(new Payment(999L,"hello"));
    }

    @Test
    public void test1(){
        paymentMapper.insert(new Payment(null,"558"));
    }
    @Test
    public void test12(){
        System.out.println(paymentMapper.getById(1L));
    }



}
