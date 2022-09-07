package com.cloudpayment8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudpayment8001.pojo.Payment;
import com.cloudpayment8001.service.PaymentService;
import com.cloudpayment8001.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【payment_1】的数据库操作Service实现
* @createDate 2022-09-07 21:12:22
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

    @Autowired
    PaymentMapper paymentMapper;


    @Override
    public int create(Payment payment) {
        return paymentMapper.insertSelective(payment);
    }

}




