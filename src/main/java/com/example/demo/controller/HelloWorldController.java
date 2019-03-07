/*
package com.example.demo.controller;

import com.example.demo.domain.User;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;


*/
/**
 * Created by ccq on 2019/2/18.
 *//*

@RestController
public class HelloWorldController {
    private static final org.slf4j.Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;

    */
/*@RequestMapping("/hello")
    public String index() {
        log.info("ccq棒棒的");
        System.out.println("title:" + title + "  description:" + description);
        return "Hello Wo";
    }*//*


    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }

    @RequestMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
*/
