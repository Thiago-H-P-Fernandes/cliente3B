package br.senai.component;

import br.senai.model.Cliente;
import br.senai.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional

public class ClientesIniciais implements CommandLineRunner {

    @Autowired
    private ClienteServiceImpl clienteService;
    @Override
    public void run(String... args) throws Exception {
//        Cliente cliente1 = new Cliente();
//        Cliente cliente2 = new Cliente();
//
//        cliente1.setNome("Thiago");
//        cliente1.setEmail("thiago@gmail.com");
//        cliente1.setCpf("123.456.789-22");
//
//        cliente2.setNome("Eduardo");
//        cliente2.setEmail("eduardo@gmail.com");
//        cliente2.setCpf("987.654.321-22");
//
//        clienteService.save(cliente1);
//        clienteService.save(cliente2);
    }
}
