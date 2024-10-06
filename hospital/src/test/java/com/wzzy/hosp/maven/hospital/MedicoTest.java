package com.wzzy.hosp.maven.hospital;

import com.wzzy.hosp.maven.project.hospital.endereco.DadosEndereco;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.DadosCadastroMedico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.EspecialidadeMedico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.Medico;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MedicoTest {

    @Test
    public void testCriacaoMedicoComEspecialidadeCardiologia() {
        DadosEndereco endereco = new DadosEndereco("Rua A", "Bairro A", "12345678", "Cidade A", "UF", "Complemento A", "100");
        DadosCadastroMedico dadosMedico = new DadosCadastroMedico("Dr. João", "joao@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, endereco);
        Medico medico = new Medico(dadosMedico);

        assertEquals("Dr. João", medico.getNome());
        assertEquals("joao@example.com", medico.getEmail());
        assertEquals(EspecialidadeMedico.CARDIOLOGIA, medico.getEspecialidade());
    }

    @Test
    public void testCriacaoMedicoComEspecialidadeNeurologia() {
        DadosEndereco endereco = new DadosEndereco("Rua B", "Bairro B", "87654321", "Cidade B", "UF", "Complemento B", "200");
        DadosCadastroMedico dadosMedico = new DadosCadastroMedico("Dra. Maria", "maria@example.com", "987654321", "4321", EspecialidadeMedico.NEUROLOGIA, endereco);
        Medico medico = new Medico(dadosMedico);

        assertEquals("Dra. Maria", medico.getNome());
        assertEquals("maria@example.com", medico.getEmail());
        assertEquals(EspecialidadeMedico.NEUROLOGIA, medico.getEspecialidade());
    }
}
