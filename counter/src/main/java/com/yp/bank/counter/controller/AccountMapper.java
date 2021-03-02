package com.yp.bank.counter.controller;
/**
 * @author pan
 * @date 2021/3/2 15:35
 */

import com.yp.bank.common.dto.HttpResp;
import com.yp.bank.common.entity.Account;
import com.yp.bank.counter.service.IAccountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName : com.yp.bank.counter.controller.AccountMapper
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 15:35
 */

@RestController
@Api(tags = "账户管理模块")
@RequestMapping("app/bank/counter")
public class AccountMapper {
    @Autowired
    public IAccountService iAccountService;

    @ApiOperation("办银行卡， 增加账户")
    @PutMapping("/addAccount.do")
    public HttpResp addAccount( Account account){
        iAccountService.addAccount(account);
        return  new HttpResp(200, "成功插入", null, LocalDateTime.now());
    }

    @ApiOperation("删除账户， 银行卡注销")
    @PostMapping("/deleteAccount.do")
    public HttpResp deleteAccount(int accountId){
        iAccountService.deleteAccount(accountId);
        return new HttpResp(200, "成功删除", null, LocalDateTime.now());
    }

    @ApiOperation("修改账户基本信息")
    @PostMapping("/updateAccount.do")
    public HttpResp updateAccount(Account account){
        iAccountService.updateAccount(account);
        return new HttpResp(200, null, "成功修改账户信息",LocalDateTime.now());
    }

    @ApiOperation("根据id查询账户的详细的情况")
    @GetMapping("/findOneByID.do")
    public HttpResp findOneById(int userId){
        Account oneById = iAccountService.findOneById(userId);
        return new HttpResp(200, "成功查找", oneById, LocalDateTime.now());
    }

    @ApiOperation("所有账户信息")
    @GetMapping("/findAll.do")
    public HttpResp findAll(){
        List<Account> all = iAccountService.findAll();
        return new HttpResp(200, "成功查找", all, LocalDateTime.now());
    }
}
