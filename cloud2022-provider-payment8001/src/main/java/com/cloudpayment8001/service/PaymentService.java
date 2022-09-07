package com.cloudpayment8001.service;

import com.cloudpayment8001.pojo.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Insert;

import java.io.Serializable;

/**
* @author Administrator
* @description 针对表【payment_1】的数据库操作Service
* @createDate 2022-09-07 21:12:22
*/
public interface PaymentService extends IService<Payment> {


    int create(Payment payment);


}
