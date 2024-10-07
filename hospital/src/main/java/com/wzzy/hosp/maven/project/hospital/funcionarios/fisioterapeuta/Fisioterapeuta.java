package com.wzzy.hosp.maven.project.hospital.funcionarios.fisioterapeuta;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "fisioterapeuta")
@Entity(name = "Fisioterapeuta")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Fisioterapeuta extends Funcionario {

    private String crefito;
    private EspecialidadeFisioterapeuta especialidadeFisioterapeuta;

    public Fisioterapeuta(Long id, String nome, String cpf, String telefone, String email, String crefito, EspecialidadeFisioterapeuta especialidadeFisioterapeuta) {
        super(id, nome, cpf, telefone, email);
        this.crefito = crefito;
        this.especialidadeFisioterapeuta = especialidadeFisioterapeuta;
    }

    public String getCrefito() {
        return crefito;
    }

    public void setCrefito(String registroRadiologia) {
        this.crefito = registroRadiologia;
    }

    public EspecialidadeFisioterapeuta getEspecialidadeFisioterapeuta() {
        return especialidadeFisioterapeuta;
    }

    public void setEspecialidadeFisioterapeuta(EspecialidadeFisioterapeuta especialidadeFisioterapeuta) {
        this.especialidadeFisioterapeuta = especialidadeFisioterapeuta;
    }
}