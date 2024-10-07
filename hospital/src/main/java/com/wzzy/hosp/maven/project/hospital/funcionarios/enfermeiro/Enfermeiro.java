package com.wzzy.hosp.maven.project.hospital.funcionarios.enfermeiro;

import com.wzzy.hosp.maven.project.hospital.endereco.Endereco;
import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;

public class Enfermeiro extends Funcionario {

    private String coren;

    public Enfermeiro(String nome, String cpf, String telefone, String email, Endereco endereco, String coren) {
        super(nome, cpf, telefone, email, endereco);
        this.coren = coren;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    @Override
    public String getRegistroProfissional() {
        return coren;
    }
}

