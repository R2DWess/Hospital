package com.wzzy.hosp.maven.project.hospital.funcionarios.enfermeiro;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "enfermeiro")
@Entity(name = "Enfermeiro")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Enfermeiro extends Funcionario {

    private String coren;
    private EspecialidadeEnfermeiro especialidadeEnfermeiro;

    public Enfermeiro(Long id, String nome, String cpf, String telefone, String email, String coren, EspecialidadeEnfermeiro especialidadeEnfermeiro) {
        super(id, nome, cpf, telefone, email);
        this.coren = coren;
        this.especialidadeEnfermeiro = especialidadeEnfermeiro;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public EspecialidadeEnfermeiro getEspecialidadeEnfermeiro() {
        return especialidadeEnfermeiro;
    }

    public void setEspecialidade(EspecialidadeEnfermeiro especialidadeEnfermeiro) {
        this.especialidadeEnfermeiro = especialidadeEnfermeiro;
    }
}

