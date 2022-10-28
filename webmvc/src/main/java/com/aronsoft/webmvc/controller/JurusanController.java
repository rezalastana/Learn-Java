package com.aronsoft.webmvc.controller;

import com.aronsoft.webmvc.model.JurusanModel;
import com.aronsoft.webmvc.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/jurusan")
public class JurusanController {
    private JurusanService service;
    @Autowired
    public JurusanController(JurusanService service) {
        this.service = service;
    }



}
