package com.wzzy.hosp.maven.hospital;

import com.wzzy.hosp.maven.project.hospital.ProjetoHospitalApplication;
import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.*;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import com.wzzy.hosp.maven.project.hospital.controller.MedicoController;
import com.wzzy.hosp.maven.project.hospital.endereco.*;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest(classes = ProjetoHospitalApplication.class)
public class MedicoControllerTest {

    @Mock
    private MedicoRepository repository;

    @InjectMocks
    private MedicoController controller;

    public MedicoControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testCadastrar() {
        DadosCadastroMedico dados = new DadosCadastroMedico("Nome", "email@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123"));
        controller.cadastrar(dados);
        verify(repository, times(1)).save(any(Medico.class));
    }

    @Test
    public void testListarTodos() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(new DadosCadastroMedico("Nome", "email@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123"))));
        when(repository.findAll()).thenReturn(medicos);

        List<DadosListagemMedico> result = controller.listarTodos();
        assertEquals(1, result.size());
    }

    @Test
    public void testListarAtivos() {
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(new DadosCadastroMedico("Nome", "email@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123"))));
        Page<Medico> page = new PageImpl<>(medicos);
        when(repository.findAllByAtivoTrue(any(Pageable.class))).thenReturn(page);

        Page<DadosListagemMedico> result = controller.listarAtivos(PageRequest.of(0, 10));
        assertEquals(1, result.getTotalElements());
    }

    @Test
    public void testAtualizarMedico() {
        Medico medico = new Medico(new DadosCadastroMedico("Nome", "email@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123")));
        when(repository.getReferenceById(anyLong())).thenReturn(medico);

        DadosAtualizacaoMedico dados = new DadosAtualizacaoMedico(1L, "Nome Atualizado", "123456789", new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123"));
        controller.atualizarMedico(dados);

        verify(repository, times(1)).getReferenceById(anyLong());
        assertEquals("Nome Atualizado", medico.getNome());
    }

    @Test
    public void testExcluir() {
        Medico medico = new Medico(new DadosCadastroMedico("Nome", "email@example.com", "123456789", "1234", EspecialidadeMedico.CARDIOLOGIA, new DadosEndereco("Rua", "Bairro", "12345678", "Cidade", "UF", "Complemento", "123")));
        when(repository.getReferenceById(anyLong())).thenReturn(medico);

        controller.excluir(1L);

        verify(repository, times(1)).getReferenceById(anyLong());
        assertFalse(medico.getAtivo());
    }
}
