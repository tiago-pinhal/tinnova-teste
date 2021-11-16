package com.teste.backend;

import com.teste.backend.domain.Veiculo;
import com.teste.backend.repositories.VeiculoRepository;
import java.awt.print.Book;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
    VeiculoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Veiculo gol = new Veiculo();
        gol.setVeiculo("Gol");
        gol.setMarca("Volkswagen");
        gol.setAno(2011);
        gol.setDescricao("Gol Trend");
        gol.setVendido(false);

        Veiculo corsa = new Veiculo();
        corsa.setVeiculo("Corsa");
        corsa.setMarca("Chevrolet");
        corsa.setAno(2012);
        corsa.setDescricao("Corsa");
        corsa.setVendido(true);
        repository.saveAll(Arrays.asList(gol, corsa));
    }

}
