package com.yp.bank.user.service;


import com.yp.bank.domain.entity.User;

import java.util.List;

/**
 * @author pan
 * @date 2021/3/2 12:34
 */

/**
 * 接口类的实现
 */
public interface IUserService {
    public int addUser(User user);
    public int deleteUser(int userId);
    public int updateUser(User user);
    public User findOneById(int userId);
    public List<User> findAll();
    public User login(String userName, String userPassword);
    public List<User> Queue(int userId);
    public User popQueue();
}
