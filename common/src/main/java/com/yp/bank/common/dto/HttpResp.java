package com.yp.bank.common.dto;
/**
 * @author pan
 * @date 2021/3/2 11:25
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @ClassName : com.yp.bank.common.dto.HttpResp
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 11:25
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResp {
    private int id;
    private String msg;
    private Object results;
    private LocalDateTime times;
}

