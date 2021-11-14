package com.teste.backend.resources;

import com.teste.backend.domain.Veiculo;
import com.teste.backend.services.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tiago Pinhal
 */
@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {

    @Autowired
    private VeiculoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Veiculo>> findAll() {
        List<Veiculo> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

}
