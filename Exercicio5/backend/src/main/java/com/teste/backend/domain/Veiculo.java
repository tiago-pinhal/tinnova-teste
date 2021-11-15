package com.teste.backend.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author Tiago Pinhal
 */
@Data
@Entity
public class Veiculo implements Serializable {

    @Id
    private String veiculo;
    @NotBlank(message = "Campo obrigatório")
    private String marca;
    @NotNull(message = "Campo obrigatório")
    private Integer ano;
    private String descricao;
    private Boolean vendido;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;

}
