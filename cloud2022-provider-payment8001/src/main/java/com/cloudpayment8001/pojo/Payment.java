package com.cloudpayment8001.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName payment_1
 */
@TableName(value ="payment_1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * UID
     */
    @TableId(value = "payment_id",type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    @TableField("payment_serial")
    private String serial;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}