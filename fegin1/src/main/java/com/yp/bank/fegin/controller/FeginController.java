package com.yp.bank.fegin.controller;
/**
 * @author pan
 * @date 2021/3/3 21:28
 */

import com.yp.bank.domain.dto.HttpResp;
import com.yp.bank.domain.entity.Account;
import com.yp.bank.fegin.Service.IFeginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName : com.yp.bank.fegin.controller.FeginController
 * @Description : 类描述
 * @author pan
 * @date 2021/3/3 21:28
 */
@RestController
@Api(tags = "fegin管理模块")
@RequestMapping("app/bank/fegin")
public class FeginController {
    @Autowired
    public IFeginService iFeginService;

    @GetMapping("/whoIs.do")
    public String WhoIs(){
        return  iFeginService.who();
    }

    @ApiOperation("办银行卡， 增加账户")
    @PutMapping("/addAccount.do")
    public HttpResp addAccount( Account account){
        System.out.println(account);
        return iFeginService.addAccount(account);
    }

    @ApiOperation("删除账户， 银行卡注销")
    @PostMapping("/deleteAccount.do")
    public HttpResp deleteAccount(Integer accountId){
        System.out.println(accountId);
        return iFeginService.deleteAccount(accountId);
    }

    @ApiOperation("修改账户基本信息")
    @PostMapping("/updateAccount.do")
    public HttpResp updateAccount(Account account){
        System.out.println(account);
        return iFeginService.updateAccount(account);
    }

    @ApiOperation("根据id查询账户的详细的情况")
    @GetMapping("/findOneByID.do")
    public HttpResp findOneById(@RequestParam Integer id){
        System.out.println(id);
        return iFeginService.findOneById(id);
    }

    @ApiOperation("所有账户信息")
    @GetMapping("/findAll.do")
    public HttpResp findAll(){
        return iFeginService.findAll();
    }




}
