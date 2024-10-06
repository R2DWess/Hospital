package com.wzzy.hosp.maven.hospital;

import static org.mockito.Mockito.*;

import com.wzzy.hosp.maven.project.hospital.controller.MedicoController;
import com.wzzy.hosp.maven.project.hospital.endereco.DadosEndereco;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.DadosCadastroMedico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.EspecialidadeMedico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.Medico;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.MedicoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MedicoRepositoryTest {

    @Mock
    private MedicoRepository medicoRepository;

    @InjectMocks
    private MedicoController medicoController;

    public MedicoRepositoryTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarMedicoComEspecialidade() {
        // Dados do médico
        DadosEndereco endereco = new DadosEndereco("Rua C", "Bairro C", "65432100", "Cidade C", "UF", "Complemento C", "300");
        DadosCadastroMedico dadosMedico = new DadosCadastroMedico("Dr. Pedro", "pedro@example.com", "321456987", "5678", EspecialidadeMedico.ORTOPEDIA, endereco);
        Medico medico = new Medico(dadosMedico);

        // Simular a operação de salvar
        medicoController.cadastrar(dadosMedico);
        verify(medicoRepository, times(1)).save(any(Medico.class));
    }
}
