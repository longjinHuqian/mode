package com.spring.controler;

import com.spring.pojo.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserControler {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public List<User> index(){
        return userService.findUserAll();
    }
}
