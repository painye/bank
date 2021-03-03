package com.yp.bank.user.service.imp;
/**
 * @author pan
 * @date 2021/3/2 13:10
 */

import com.yp.bank.domain.entity.User;
import com.yp.bank.user.mapper.IUserMapper;
import com.yp.bank.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName : com.yp.bank.user.service.imp.IUserServiceImpl
 * @Description : 类描述
 * @author pan
 * @date 2021/3/2 13:10
 */

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    public IUserMapper iUserMapper;

    @Override
    public int addUser(User user) {
        Date date=new Date();
        user.setUserCreateTime(date);
        user.setUserDelete(0);
        return iUserMapper.addUser(user);
    }

    @Override
    public int deleteUser(int userId) {
        return iUserMapper.deleteUser(userId);
    }

    @Override
    public int updateUser(User user) {
        Date date = new Date();
        user.setUserUpdateTime(date);
        return iUserMapper.updateUser(user);
    }

    @Override
    public User findOneById(int userId) {
        return iUserMapper.findOneById(userId);
    }

    @Override
    public List<User> findAll() {
        return iUserMapper.findAll();
    }

    @Override
    public User login(String userName, String userPassword) {
        return null;
    }


}
