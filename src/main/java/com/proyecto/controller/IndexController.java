package com.proyecto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Bienvenido");
        model.addAttribute("pageSubtitle", "Panel de control principal");
        model.addAttribute("content", "index :: content");
        return "layouts/main-layout";
    }
}