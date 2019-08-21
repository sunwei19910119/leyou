package com.leyou.auth.service.impl;

import com.leyou.auth.client.UserClient;
import com.leyou.auth.entity.UserInfo;
import com.leyou.auth.properties.JwtProperties;
import com.leyou.auth.service.AuthService;
import com.leyou.auth.utils.JwtUtils;
import com.leyou.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserClient userClient;

    @Autowired
    private JwtProperties properties;

    /**
     * 用户授权
     * @param username
     * @param password
     * @return
     */
    @Override
    public String authentication(String username, String password) {
        //查询用户信息
        try {
            User user = this.userClient.queryUser(username,password);
            if(user == null){
                return null;
            }
            //查询结果不为空，返回token
            String token = JwtUtils.generateToken(new UserInfo(user.getId(),user.getUsername()),properties.getPrivateKey(),properties.getExpire());

            return token;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
