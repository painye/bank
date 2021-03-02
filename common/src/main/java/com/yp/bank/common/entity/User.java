package com.yp.bank.common.entity;
/**
 * @author pan
 * @date 2021/3/2 11:06
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName : com.yp.bank.common.entity.User
 * @Description : 顾客的用户信息类
 * @author pan
 * @date 2021/3/2 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userPhone;
    private String userAddress;
    private Integer userDelete;
    private Date userCreateTime;
    private Date userUpdateTime;
}
