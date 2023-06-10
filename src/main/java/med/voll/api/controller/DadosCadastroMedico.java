package med.voll.api.controller;

import lombok.Getter;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medico.Especialidade;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Getter
public final class DadosCadastroMedico {
    @NotBlank
    private String nome;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    private String crm;
    @NotNull
    private Especialidade especialidade;
    @NotNull
    @Valid
    private DadosEndereco endereco;

    public DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }
}
