package com.yp.bank.counter.service;


import com.yp.bank.domain.entity.Account;

import java.util.List;

/**
 * @author pan
 * @date 2021/3/2 15:03
 */
public interface IAccountService {
    public int addAccount(Account account);
    public int deleteAccount(int accountId);
    public int updateAccount(Account account);
    public Account findOneById(int accountId);
    public List<Account> findAll();
}
