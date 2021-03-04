package com.yp.bank.fegin.Service.impl;
/**
 * @author pan
 * @date 2021/3/4 13:59
 */

import com.yp.bank.domain.dto.HttpResp;
import com.yp.bank.domain.entity.Account;
import com.yp.bank.fegin.Service.IFeginService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @ClassName : com.yp.bank.fegin.Service.impl.IFeginServiceImpl
 * @Description : 类描述
 * @author pan
 * @date 2021/3/4 13:59
 */
@Component
public class IFeginServiceImpl implements IFeginService {
    @Override
    public String who() {
        return "can't find";
    }

    @Override
    public HttpResp addAccount(Account account) {
        return new HttpResp(500, "error", null, LocalDateTime.now());
    }

    @Override
    public HttpResp deleteAccount(Integer accountId) {
        return new HttpResp(500, "error", null, LocalDateTime.now());
    }

    @Override
    public HttpResp updateAccount(Account account) {
        return new HttpResp(500, "error", null, LocalDateTime.now());
    }

    @Override
    public HttpResp findOneById(Integer id) {
        return new HttpResp(500, "error", null, LocalDateTime.now());
    }

    @Override
    public HttpResp findAll() {
        return new HttpResp(500, "error", null, LocalDateTime.now());
    }
}
