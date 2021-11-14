package com.teste.backend.services;

import com.teste.backend.domain.Veiculo;
import com.teste.backend.repositories.VeiculoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tiago Pinhal
 */
@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repo;

    public List<Veiculo> findAll() {
        return repo.findAll();
    }

}
