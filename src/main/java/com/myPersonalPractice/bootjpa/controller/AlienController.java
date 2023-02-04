package com.myPersonalPractice.bootjpa.controller;

import com.myPersonalPractice.bootjpa.Repository.AlienRepo;
import com.myPersonalPractice.bootjpa.entity.AlienEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam Integer aid){
        ModelAndView mv = new ModelAndView("showAlien.jsp");
        AlienEntity alien = repo.findById(aid).orElse(new AlienEntity());
        mv.addObject(alien);
        return mv;
    }

}
