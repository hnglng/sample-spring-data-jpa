package com.hnglng.sample.spring.data.jpa.web.controller;

import com.hnglng.sample.spring.data.jpa.domain.model.User;
import com.hnglng.sample.spring.data.jpa.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by huang_liang on 2017/2/23.
 */
@Controller
public class HelloController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String index(ModelMap map) {
        User user = userService.findUserby("AA");

        String userName = "Not found";
        if (user != null){
            userName = user.getName();
        }

        // 加入一个属性，用来在模板中读取
        map.addAttribute("user", userName);
        //map.addAttribute("user", "AAA");

        // return模板文件的名称，对应src/main/resources/templates/hello.html
        return "hello";
    }
}
