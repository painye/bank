package com.yp.bank.user.controller;
/**
 * @author pan
 * @date 2021/3/2 13:28
 */

import com.yp.bank.common.dto.HttpResp;
import com.yp.bank.common.entity.User;
import com.yp.bank.user.service.IUserService;
import com.yp.bank.user.service.imp.IUserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apiguardian.api.API;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.zip.DataFormatException;

/**
 * @ClassName : com.yp.bank.user.controller.UserCOntroller
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 13:28
 */

@RestController
@Api("用户模块测试， 用户信息管理")
@RequestMapping("/app/bank/user")
public class UserController {
    @Autowired
    public IUserService iUserService;

    @ApiOperation("添加用户")
    @PutMapping("/addUser.do")
    public HttpResp addUser(User user){
        iUserService.addUser(user);
        return new HttpResp(200, "成功插入", null, LocalDateTime.now());
    }

    @ApiOperation("删除用户")
    @PostMapping("/deleteUser.do")
    public HttpResp deleteUser(int userId){
        iUserService.deleteUser(userId);
        return new HttpResp(200, "成功删除", null, LocalDateTime.now());
    }

    @ApiOperation("修改用户")
    @PostMapping("/updateUser.do")
    public HttpResp updateUser(User user){
        iUserService.updateUser(user);
        return new HttpResp(200, "成功修改", user, LocalDateTime.now());
    }

    @ApiOperation("根据Id查找用户")
    @GetMapping("/findOneByUserId.do")
    public HttpResp findOneById(int userId){
        User oneById = iUserService.findOneById(userId);
        return new HttpResp(200, "成功查找到", oneById, LocalDateTime.now());
    }

    @ApiOperation("所有用户")
    @GetMapping("/findAll.do")
    public HttpResp findAll(){
        List<User> all = iUserService.findAll();
        return new HttpResp(200, "成功删除", all, LocalDateTime.now());
    }

}
