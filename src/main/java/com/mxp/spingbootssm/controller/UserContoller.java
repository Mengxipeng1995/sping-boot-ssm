package com.mxp.spingbootssm.controller;
import com.mxp.spingbootssm.mapper.UserMapper;
import com.mxp.spingbootssm.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContoller {

    @Autowired
    private UserMapper userMapper;
    
    @ResponseBody
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id")Integer id){

        User user = userMapper.getUser(id);

        return user;
    }
}
