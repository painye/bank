package com.yp.bank.counter.mapper;

import com.yp.bank.common.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author pan
 * @date 2021/3/2 14:57
 */

@Mapper
public interface IAccountMapper {
    public int addAccount(Account account);
    public int deleteAccount(int accountId);
    public int updateAccount(Account account);
    public Account findOneById(int accountId);
    //public List<Account> findByUser(int userId);
    public List<Account> findAll();
}
