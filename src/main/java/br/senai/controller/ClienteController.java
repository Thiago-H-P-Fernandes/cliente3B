package br.senai.controller;

import br.senai.model.Cliente;
import br.senai.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/cliente/list")
    public String findAll(Model model){
        System.out.println(clienteService.findAll());
        model.addAttribute("clientes",clienteService.findAll());
        return "cliente/list";
    }

    @GetMapping("/cliente/signin")
    public String signIn(Model model){
        model.addAttribute("cliente",new Cliente());
        return "cliente/signin";
    }

//    @GetMapping("/cliente/edit")
//    public String edit(Model model, @PathVariable("id") long id, Cliente cliente){
//        Cliente cliente0pt = clienteService.findById(id);
//        if (cliente0pt.isEmpty()){
//            throw new IllegalArgumentException("Pessoa Inválida");
//        }
//        model.addAttribute("cliente", cliente0pt.get());
//        return "cliente/edit";
//    }

    @PostMapping("/cliente/save")
    public String save(Cliente cliente, Model model) {
        try {
            clienteService.save(cliente);
            model.addAttribute("cliente", cliente);
            model.addAttribute("isSave", true);
            return "cliente/signin";
        } catch (Exception e) {
            model.addAttribute("cliente", cliente);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "cliente/signin";
        }
    }
}
