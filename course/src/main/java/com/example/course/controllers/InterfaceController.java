package com.example.course.controllers;

import com.example.course.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterfaceController {

    @Autowired()
    @Qualifier("miServicioSimple")
    private IService service;

    @GetMapping("/control")
    public String control(Model model){
        model.addAttribute("titulo","InterfaceController");
        model.addAttribute("operacion",service.operacion());
        return "interface";
    }
}
