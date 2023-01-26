package com.slicing.figma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("profile/index");
        return view;
    }
}
