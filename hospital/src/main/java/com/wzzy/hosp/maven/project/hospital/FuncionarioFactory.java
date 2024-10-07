package com.wzzy.hosp.maven.project.hospital;

import com.wzzy.hosp.maven.project.hospital.funcionarios.Funcionario;
import com.wzzy.hosp.maven.project.hospital.funcionarios.enfermeiro.Enfermeiro;
import com.wzzy.hosp.maven.project.hospital.funcionarios.enfermeiro.EspecialidadeEnfermeiro;
import com.wzzy.hosp.maven.project.hospital.funcionarios.farmaceutico.EspecialidadeFarmaceutico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.farmaceutico.Farmaceutico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.fisioterapeuta.EspecialidadeFisioterapeuta;
import com.wzzy.hosp.maven.project.hospital.funcionarios.fisioterapeuta.Fisioterapeuta;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.EspecialidadeMedico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.Medico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.nutricionista.EspecialidadeNutricionista;
import com.wzzy.hosp.maven.project.hospital.funcionarios.nutricionista.Nutricionista;
import com.wzzy.hosp.maven.project.hospital.funcionarios.radiologista.EspecialidadeTecnicoRadiologista;
import com.wzzy.hosp.maven.project.hospital.funcionarios.radiologista.TecnicoRadiologista;

public class FuncionarioFactory {

    public static Funcionario criarFuncionario(Long id,
                                               String tipo,
                                               String nome,
                                               String cpf,
                                               String telefone,
                                               String email,
                                               String registroProfissional,
                                               EspecialidadeMedico especialidadeMedico,
                                               EspecialidadeNutricionista especialidadeNutricionista,
                                               EspecialidadeEnfermeiro especialidadeEnfermeiro,
                                               EspecialidadeFarmaceutico especialidadeFarmaceutico,
                                               EspecialidadeFisioterapeuta especialidadeFisioterapeuta,
                                               EspecialidadeTecnicoRadiologista especialidadeTecnicoRadiologista) {
        switch (tipo.toLowerCase()) {
            case "medico":
                return new Medico(id, nome, cpf, telefone, email, registroProfissional, especialidadeMedico);
            case "nutricionista":
                return new Nutricionista(id, nome, cpf, telefone, email, registroProfissional, especialidadeNutricionista);
            case "enfermeiro":
                return new Enfermeiro(id, nome, cpf, telefone, email, registroProfissional, especialidadeEnfermeiro);
            case "farmaceutico":
                return new Farmaceutico(id, nome, cpf, telefone, email, registroProfissional, especialidadeFarmaceutico);
            case "fisioterapeuta":
                return new Fisioterapeuta(id, nome, cpf, telefone, email, registroProfissional, especialidadeFisioterapeuta);
            case "radiologista":
                return new TecnicoRadiologista(id, nome, cpf, telefone, email, registroProfissional, especialidadeTecnicoRadiologista);
            default:
                throw new IllegalArgumentException("Tipo de funcionário desconhecido: " + tipo);
        }
    }
}
