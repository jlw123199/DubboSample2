package com.xl.producer1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import xl.com.dubboapp.api.IUserService;


@Service
public class UserServiceImpl1 implements IUserService {

    private Logger logger = LoggerFactory.getLogger(com.xl.producer1.UserServiceImpl1.class);

    //@Override
    public boolean login(String username, String password) {
        logger.info("用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }

    public String Greeting(String name){
        return "From Impl1 == Hi " + name;
    }
}