package br.com.bfelix.crudwiththymeleaf.models.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "endereco")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroDaCasa;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    @ManyToOne
    private CandidatoEntity candidato;
}
