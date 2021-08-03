package com.demo.controller;

import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.UserService;
import java.util.List;

/**
 * 创建UserController类,user-web模块依赖于user-service和user-domain模块，所以需在pom.xml文件中引入user-service和user-domain依赖
 * @author qzz
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getList(){
        return userService.query();
    }
}
