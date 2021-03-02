package com.yp.bank.counter.service.imp;
/**
 * @author pan
 * @date 2021/3/2 15:04
 */

import com.yp.bank.common.entity.Account;
import com.yp.bank.counter.mapper.IAccountMapper;
import com.yp.bank.counter.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

/**
 * @ClassName : com.yp.bank.counter.service.imp.IAccountServiceImpl
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 15:04
 */

@Service
public class IAccountServiceImpl  implements IAccountService {
    @Autowired
    public IAccountMapper accountMapper;

    @Override
    public int addAccount(Account account) {
        Date date = new Date();
        account.setAccountCreateTime(date);
        account.setAccountDelete(0);
        return accountMapper.addAccount(account);
    }


    @Override
    public int deleteAccount(int accountId) {
        return accountMapper.deleteAccount(accountId);
    }

    @Override
    public int updateAccount(Account account) {
        Date date = new Date();
        account.setAccountUpdateTime(date);
        return accountMapper.updateAccount(account);
    }

    @Override
    public Account findOneById(int accountId) {
        return accountMapper.findOneById(accountId);
    }


    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
