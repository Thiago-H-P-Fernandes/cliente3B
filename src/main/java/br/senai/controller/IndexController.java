package br.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/Home")
    public String index(){
        return "index";
    }

    @GetMapping("/Sobre")
    public String sobre(){
        return "sobre";
    }

    @GetMapping("/Eventos")
    public String eventos(){
        return "eventos";
    }
}