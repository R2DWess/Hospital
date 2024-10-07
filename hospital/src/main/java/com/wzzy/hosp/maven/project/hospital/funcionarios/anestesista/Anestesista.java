package com.wzzy.hosp.maven.project.hospital.funcionarios.anestesista;

import com.wzzy.hosp.maven.project.hospital.endereco.Endereco;
import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;

public class Anestesista extends Funcionario {

    private String crm;
    private EspecialidadeAnestesista especialidadeAnestesista;

    public Anestesista(String nome,
                       String cpf,
                       String telefone,
                       String email,
                       Endereco endereco,
                       String crm,
                       EspecialidadeAnestesista especialidadeAnestesista) {
        super(nome, cpf, telefone, email, endereco);
        this.crm = crm;
        this.especialidadeAnestesista = especialidadeAnestesista;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public EspecialidadeAnestesista getEspecialidadeAnestesista() {
        return especialidadeAnestesista;
    }

    public void setEspecialidadeAnestesista(EspecialidadeAnestesista especialidadeAnestesista) {
        this.especialidadeAnestesista = especialidadeAnestesista;
    }

    @Override
    public String getRegistroProfissional() {
        return crm;
    }
}
