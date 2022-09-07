package com.cloudpayment8001.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cloudpayment8001.pojo.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author Administrator
* @description 针对表【payment_1】的数据库操作Mapper
* @createDate 2022-09-07 21:12:22
* @Entity com.cloudpayment8001.pojo.Payment
*/

@Repository
public interface PaymentMapper extends BaseMapper<Payment> {

    //选择性添加
    int insertSelective(Payment payment);

    //根据id获取
    List<Payment> getById(@Param("id") Long id);





}




