package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "medicos")
@Entity(name = "Medico")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico extends Funcionario {

    private String crm;
    private EspecialidadeMedico especialidadeMedico;

    public Medico(Long id, String nome, String cpf, String telefone, String email, String crm, EspecialidadeMedico especialidadeMedico) {
        super(id, nome, cpf, telefone, email);
        this.crm = crm;
        this.especialidadeMedico = especialidadeMedico;
    }

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
}
