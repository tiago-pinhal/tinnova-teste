package com.teste.backend.repositories;

import com.teste.backend.domain.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "veiculo", path = "veiculos")
public interface VeiculoRepository extends PagingAndSortingRepository<Veiculo, String> {

    List<Veiculo> findByVeiculo(@Param("veiculo") String veiculo);

    List<Veiculo> findByMarca(@Param("marca") String marca);

    List<Veiculo> findByAno(@Param("ano") Integer ano);

    @Query("select count(*) from Veiculo v where v.vendido = false")
    long qtdVeiculosNaoVendidos();

    @Query(value = "SELECT CONVERT(CONCAT(LEFT(v.ano,3), '0'),integer) as decada, count(v.ano) as qtd FROM VEICULO v WHERE v.ano BETWEEN CONVERT(CONCAT(LEFT(v.ano,3), '0'),integer) AND CONVERT(CONCAT(LEFT(v.ano,3), '0'),integer) + 10 group by v.ano", nativeQuery = true)
    Object[] qtdVeiculosPorDecada();

    @Query(value = "SELECT marca, count(*) FROM VEICULO Group By marca ", nativeQuery = true)
    Object[] qtdVeiculosPorMarca();
    
    @Query(value = "SELECT v FROM Veiculo v where v.created >= current_date - 7")
    List<Veiculo> findCadastradosUltimaSemana();
}
