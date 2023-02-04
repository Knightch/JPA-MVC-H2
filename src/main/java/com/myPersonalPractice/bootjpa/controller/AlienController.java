package com.myPersonalPractice.bootjpa.controller;

import com.myPersonalPractice.bootjpa.Repository.AlienRepo;
import com.myPersonalPractice.bootjpa.entity.AlienEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public String addAlien(AlienEntity alien){
        repo.save(alien);
        return "home.jsp";
    }
}
