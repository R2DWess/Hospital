package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

import com.wzzy.hosp.maven.project.hospital.endereco.Endereco;
import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "medicos")
@Entity(name = "Medico")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico extends Funcionario {

    private Boolean ativo = true;
    private String crm;
    private EspecialidadeMedico especialidadeMedico;

    @Embedded
    private Endereco endereco;

    // Construtor que aceita todos os parâmetros, incluindo endereço e especialidade

    public Medico(Long id, String nome, String cpf, String telefone, String email, String crm, EspecialidadeMedico especialidadeMedico, Endereco endereco) {
        super(id, nome, cpf, telefone, email, endereco);
        this.crm = crm;
        this.especialidadeMedico = especialidadeMedico;
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public EspecialidadeMedico getEspecialidade() {
        return especialidadeMedico;
    }

    public void setEspecialidade(EspecialidadeMedico especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void excluir() {
        this.ativo = false;
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if (dados.nome() != null) {
            this.setNome(dados.nome());
        }
        if (dados.telefone() != null) {
            this.setTelefone(dados.telefone());
        }
        if (dados.cpf() != null) {
            this.setCpf(dados.cpf());
        }
        if (dados.email() != null) {
            this.setEmail(dados.email());
        }
        if (dados.crm() != null) {
            this.crm = dados.crm();
        }
        if (dados.especialidadeMedico() != null) {
            this.especialidadeMedico = dados.especialidadeMedico();
        }
        if (dados.dadosEndereco() != null) {
            this.endereco.atualizarInformacoes(dados.dadosEndereco());
        }
    }
}
