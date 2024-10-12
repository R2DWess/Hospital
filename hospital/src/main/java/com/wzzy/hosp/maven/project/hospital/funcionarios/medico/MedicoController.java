// MedicoController.java
package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @Autowired
    private MedicoRepository repository;

    @PostMapping("/cadastrar")
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        medicoService.cadastrar(dados);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        medicoService.atualizarMedico(dados);
    }

    @DeleteMapping("/deletar/{id}")
    public void excluir(@PathVariable Long id) {
        medicoService.excluir(id);
    }

    @GetMapping("/buscar")
    public Page<DadosListagemMedico> buscar(
            @RequestParam(required = false) EspecialidadeMedico especialidade,
            @PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        if (especialidade != null) {
            return repository.findByEspecialidade(especialidade, paginacao)
                    .map(DadosListagemMedico::new);
        }
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
    }

    @Cacheable("medicos")
    @GetMapping("/listar")
    public List<DadosListagemMedico> listarTodos() {
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}