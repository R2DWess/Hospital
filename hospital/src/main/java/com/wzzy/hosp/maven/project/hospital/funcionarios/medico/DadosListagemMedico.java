package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

public record DadosListagemMedico(

        Long id,
        String nome,
        String email,
        String crm,
        EspecialidadeMedico especialidadeMedico){

    public DadosListagemMedico(Medico medico){
        this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}