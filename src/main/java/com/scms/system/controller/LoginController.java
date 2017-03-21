package com.scms.system.controller;

import com.scms.entity.User;
import com.scms.system.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by hz on 17-3-21.
 */
@Controller
public class LoginController {

    @Resource(name = "userServiceImpl")
    UserService service;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(@RequestParam(value = "u") String user) {
        User user1 = new User();
//
        user1.setId(1);
        user1.setUsername("hz");
        user1.setPassword("hh");
        user1.setRole(1);
        service.insert(user1);
        User user2 = service.selectByPrimaryKey(1);
        System.out.println(user2.getUsername());
        return null;
    }
}
