package com.example.plus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.plus.entity.User;
import com.example.plus.mapper.UserDao;
import com.example.plus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 客户端用户表 服务实现类
 * </p>
 *
 * @author zhangxiaoxiang
 * @since 2019-07-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 根据用户ID查询用户详情
     *
     * @param id
     * @return
     */
    @Override
    public User getUser( String id) {
        Map<String,Object> map=new HashMap<>();
        map.put("user_id",id);
       User user= userDao.selectById(id);
        System.out.println(user);
        return user;
    }
}
