package com.wzzy.hosp.maven.project.hospital.funcionarios.farmaceutico;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "farmaceutico")
@Entity(name = "Farmaceutico")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Farmaceutico extends Funcionario {

    private String crf;
    private EspecialidadeFarmaceutico especialidadeFarmaceutico;

    public Farmaceutico(Long id, String nome, String cpf, String telefone, String email, String crf, EspecialidadeFarmaceutico especialidadeFarmaceutico) {
        super(id, nome, cpf, telefone, email);
        this.crf = crf;
        this.especialidadeFarmaceutico = especialidadeFarmaceutico;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public EspecialidadeFarmaceutico getEspecialidadeFarmaceutico() {
        return especialidadeFarmaceutico;
    }

    public void setEspecialidadeFarmaceutico(EspecialidadeFarmaceutico especialidadeFarmaceutico) {
        this.especialidadeFarmaceutico = especialidadeFarmaceutico;
    }
}