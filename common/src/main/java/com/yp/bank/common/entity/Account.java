package com.yp.bank.common.entity;
/**
 * @author pan
 * @date 2021/3/2 11:09
 */

import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Date;

/**
 * @ClassName : com.yp.bank.common.entity.Account
 * @Description : 账户类， 银行卡的相关信息
 * @author pan
 * @date 2021/3/2 11:09
 */
public class Account {
    private Integer accountId;
    private String accountName;
    private String accountRemainder;
    private String accountPhone;
    private String accountPassword;
    private Integer accountDelete;
    private Date accountCreateTime;
    private Date accountUpdateTime;
}
