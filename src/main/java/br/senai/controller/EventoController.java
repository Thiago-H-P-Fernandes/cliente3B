package br.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoController {
    @Autowired
    EventoServiceImpl eventoService;

    @GetMapping("/evento/list")
    public String findAll(Model model){
        model.addAttribute("eventos", eventoService.findAll());
        return "evento/list";
    }
}
