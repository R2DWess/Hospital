package com.wzzy.hosp.maven.project.hospital.funcionarios.radiologista;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "tecnico_radiologista")
@Entity(name = "TecnicoRadiologista")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class TecnicoRadiologista extends Funcionario {

    private String crtr;
    private EspecialidadeTecnicoRadiologista especialidadeTecnicoRadiologista;

    public TecnicoRadiologista(Long id, String nome, String cpf, String telefone, String email, String crtr, EspecialidadeTecnicoRadiologista especialidadeTecnicoRadiologista) {
        super(id, nome, cpf, telefone, email);
        this.crtr = crtr;
        this.especialidadeTecnicoRadiologista = especialidadeTecnicoRadiologista;
    }

    public String getCrtr() {
        return crtr;
    }

    public void setCrtr(String registroRadiologia) {
        this.crtr = registroRadiologia;
    }

    public EspecialidadeTecnicoRadiologista getEspecialidade() {
        return especialidadeTecnicoRadiologista;
    }

    public void setEspecialidade(EspecialidadeTecnicoRadiologista especialidadeTecnicoRadiologista) {
        this.especialidadeTecnicoRadiologista = especialidadeTecnicoRadiologista;
    }
}