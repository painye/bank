package com.yp.bank.fegin.Service;

import com.yp.bank.domain.dto.HttpResp;
import com.yp.bank.domain.entity.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author pan
 * @date 2021/3/3 21:26
 */

@FeignClient(value = "counter")
public interface IFeginService {
    @GetMapping("app/bank/counter/who.do")
    public String who();

    @PutMapping("app/bank/counter/addAccount.do")
    public HttpResp addAccount(Account account);

    @PostMapping("app/bank/counter/deleteAccount.do")
    public HttpResp deleteAccount(Integer accountId);

    @PostMapping("app/bank/counter/updateAccount.do")
    public HttpResp updateAccount(Account account);

    @GetMapping("app/bank/counter/findOneByID.do")
    public HttpResp findOneById(@RequestParam(value ="id") Integer id);

    @GetMapping("app/bank/counter/findAll.do")
    public HttpResp findAll();


}
