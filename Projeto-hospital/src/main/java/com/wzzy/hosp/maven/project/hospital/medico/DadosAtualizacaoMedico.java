package com.wzzy.hosp.maven.project.hospital.medico;

import com.wzzy.hosp.maven.project.hospital.endereco.DadosEndereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco dadosEndereco) {
}
