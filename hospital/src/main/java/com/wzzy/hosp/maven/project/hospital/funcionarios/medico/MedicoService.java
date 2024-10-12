package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    @Transactional
    public void cadastrar(DadosCadastroMedico dadosCadastroMedico) {
        Medico medico = new Medico(dadosCadastroMedico);
        repository.save(medico);
    }

    @Transactional
    public void atualizarMedico(DadosAtualizacaoMedico dadosCadastroMedico) {
        var medico = repository.getReferenceById(dadosCadastroMedico.id());
        medico.atualizarInformacoes(dadosCadastroMedico);
    }

    @Transactional
    public void excluir(Long id) {
        var medico = repository.getReferenceById(id);
        medico.excluir();
    }
}

