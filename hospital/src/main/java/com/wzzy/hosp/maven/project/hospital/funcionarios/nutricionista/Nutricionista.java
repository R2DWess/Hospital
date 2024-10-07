package com.wzzy.hosp.maven.project.hospital.funcionarios.nutricionista;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;

public class Nutricionista extends Funcionario {
    private String crn;
    private EspecialidadeNutricionista especialidadeNutricionista;

    public Nutricionista(Long id,
                         String nome,
                         String cpf,
                         String telefone,
                         String email,
                         String crn,
                         EspecialidadeNutricionista especialidadeNutricionista) {
        super(id, nome, cpf, telefone, email);
        this.crn = crn;
        this.especialidadeNutricionista = especialidadeNutricionista;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

        public EspecialidadeNutricionista getEspecialidadeNutricionista() {
        return especialidadeNutricionista;
    }

    public void setEspecialidade(EspecialidadeNutricionista especialidadeNutricionista) {
        this.especialidadeNutricionista = especialidadeNutricionista;
    }
}

