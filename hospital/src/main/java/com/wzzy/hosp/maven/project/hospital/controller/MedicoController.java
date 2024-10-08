package com.wzzy.hosp.maven.project.hospital.controller;


import com.wzzy.hosp.maven.project.hospital.funcionarios.medico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping("/cadastrar")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }

    @GetMapping("/listar")
    public List<DadosListagemMedico> listarTodos(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }

    @GetMapping("/listar-pagina")
    public Page<DadosListagemMedico> listarPaginas(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    @GetMapping("/listar-ativo")
    public Page<DadosListagemMedico> listarAtivos(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping("/atualizar")
    @Transactional
    public void atualizarMedico(@RequestBody @Valid DadosAtualizacaoMedico dadosCadastroMedico) {
        var medico = repository.getReferenceById(dadosCadastroMedico.id());
        medico.atualizarInformacoes(dadosCadastroMedico);
    }

    @DeleteMapping("/deletar/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var medico = repository.getReferenceById((id));
        medico.excluir();
    }
}
