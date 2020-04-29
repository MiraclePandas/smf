package com.good.smf.controller;

import com.good.smf.pojo.User;
import com.good.smf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("display")
    public String displayAllUsers(Model model){

        //循环显示
        List<User> users = userService.queryAllUsers();
        model.addAttribute("users",users);
        //Mapper应用
        Map map = new HashMap<String,String>();
        for (int i = 0; i < 10; i++) {
            map.put("key" + i, "value" + i);
        }
        model.addAttribute("map",map);

        return "display";
    }

}
