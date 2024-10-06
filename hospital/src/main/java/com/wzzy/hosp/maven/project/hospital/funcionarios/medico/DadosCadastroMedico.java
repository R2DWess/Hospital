package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;

import com.wzzy.hosp.maven.project.hospital.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroMedico(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,

        @NotNull
        EspecialidadeMedico especialidadeMedico,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
