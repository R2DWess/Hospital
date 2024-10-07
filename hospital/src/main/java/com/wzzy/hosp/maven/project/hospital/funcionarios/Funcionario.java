package com.wzzy.hosp.maven.project.hospital.funcionarios;

import com.wzzy.hosp.maven.project.hospital.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public abstract class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    @Embedded
    private Endereco endereco;

    public abstract String getRegistroProfissional();
}