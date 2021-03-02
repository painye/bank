package com.yp.bank.user.mapper;

import com.yp.bank.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author pan
 * @date 2021/3/2 12:39
 */

@Mapper
public interface IUserMapper {
    public int addUser(User user);
    public int deleteUser(int userId);
    public int updateUser(User user);
    public User findOneById(int userId);
    public List<User> findAll();
}
