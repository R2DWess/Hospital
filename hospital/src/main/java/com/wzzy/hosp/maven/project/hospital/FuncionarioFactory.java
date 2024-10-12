package com.wzzy.hosp.maven.project.hospital;

import com.wzzy.hosp.maven.project.hospital.endereco.Endereco;
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

    // Método responsável por criar um funcionário com base no tipo e especialidade passados
    public static Funcionario criarFuncionario(Long id,
                                               String tipo,
                                               String nome,
                                               String cpf,
                                               String telefone,
                                               String email,
                                               String registroProfissional,
                                               Endereco endereco, // Adicionando o endereço aqui
                                               EspecialidadeMedico especialidadeMedico,
                                               EspecialidadeNutricionista especialidadeNutricionista,
                                               EspecialidadeEnfermeiro especialidadeEnfermeiro,
                                               EspecialidadeFarmaceutico especialidadeFarmaceutico,
                                               EspecialidadeFisioterapeuta especialidadeFisioterapeuta,
                                               EspecialidadeTecnicoRadiologista especialidadeTecnicoRadiologista) {
        switch (tipo.toLowerCase()) {
            case "medico":
                return new Medico(id, nome, cpf, telefone, email, registroProfissional, especialidadeMedico, endereco);
//            case "nutricionista":
//                return new Nutricionista(id, nome, cpf, telefone, email, registroProfissional, especialidadeNutricionista, endereco);
//            case "enfermeiro":
//                return new Enfermeiro(id, nome, cpf, telefone, email, registroProfissional, especialidadeEnfermeiro, endereco);
//            case "farmaceutico":
//                return new Farmaceutico(id, nome, cpf, telefone, email, registroProfissional, especialidadeFarmaceutico, endereco);
//            case "fisioterapeuta":
//                return new Fisioterapeuta(id, nome, cpf, telefone, email, registroProfissional, especialidadeFisioterapeuta, endereco);
//            case "radiologista":
//                return new TecnicoRadiologista(id, nome, cpf, telefone, email, registroProfissional, especialidadeTecnicoRadiologista, endereco);
            default:
                throw new IllegalArgumentException("Tipo de funcionário desconhecido: " + tipo);
        }
    }
}
