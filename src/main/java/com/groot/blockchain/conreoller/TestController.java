package com.groot.blockchain.conreoller;

import com.groot.blockchain.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/")
    public @ResponseBody
    String index(){
        return "test";
    }

    @RequestMapping("/userList.html")
    public ModelAndView userList(){
        User u1 = new User("1","zhangsan","poiuy");
        User u2 = new User("2","lisi","fsdfd");
        User u3 = new User("3","wangwu","wefsfd");
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        ModelAndView modelAndView = new ModelAndView("userList");
        modelAndView.addObject("users",list);
        return modelAndView;
    }

}
