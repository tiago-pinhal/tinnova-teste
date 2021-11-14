package com.teste.backend.repositories;

import com.teste.backend.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tiago Pinhal
 */
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, String> {

}
