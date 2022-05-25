package br.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/home")
    public String index(){
        return "index";
    }

    @GetMapping("/sobre")
    public String sobre(){
        return "sobre";
    }

    @GetMapping("/eventos")
    public String eventos(){
        return "eventos";
    }
}