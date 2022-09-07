package com.cloudorder80.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 
 * @TableName payment_1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * UID
     */
    private Long id;

    /**
     * 
     */
    private String serial;

    private static final long serialVersionUID = 1L;
}