package com.wzzy.hosp.maven.project.hospital.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
        this.cidade = dadosEndereco.cidade();
        this.uf = dadosEndereco.uf();
    }

    public void atualizarInformacoes(DadosEndereco dadosEndereco) {
        if (dadosEndereco.logradouro() != null) {
            this.logradouro = dadosEndereco.logradouro();
        }
        if (dadosEndereco.logradouro() != null) {
            this.bairro = dadosEndereco.bairro();
        }
        if (dadosEndereco.logradouro() != null) {
            this.cep = dadosEndereco.cep();
        }
        if (dadosEndereco.logradouro() != null) {
            this.numero = dadosEndereco.numero();
        }
        if (dadosEndereco.logradouro() != null) {
            this.complemento = dadosEndereco.complemento();
        }
        if (dadosEndereco.logradouro() != null) {
            this.cidade = dadosEndereco.cidade();
        }
        if (dadosEndereco.logradouro() != null) {
            this.uf = dadosEndereco.uf();
        }
    }
}