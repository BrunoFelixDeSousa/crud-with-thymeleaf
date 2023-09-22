package br.com.bfelix.crudwiththymeleaf.models.entities;

import br.com.bfelix.crudwiththymeleaf.models.enums.EscolaridadeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "candidato")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    @Column(name = "data_de_nascimento")
    private LocalDate dataDeNascimento;
    @Enumerated(EnumType.ORDINAL)
    private EscolaridadeEnum escolaridade;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidato_id")
    private List<EnderecoEntity> enderecos;

}
