package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 创建UserService类，user-service模块依赖于user-dao和user-domain模块，所以需在pom.xml文件中引入user-dao和user-domain依赖
 * @author qzz
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> query(){
        return userDao.query();
    }
}
