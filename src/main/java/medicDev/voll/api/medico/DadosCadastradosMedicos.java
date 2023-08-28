package medicDev.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import medicDev.voll.api.endereco.DadosEndereco;

public record DadosCadastradosMedicos(
        @NotNull
        @NotBlank
        String nome,
        @NotNull
        @NotBlank

        String cpf,
        @NotBlank

        String telefone,
        @NotBlank
        @Email
        String email,
        @NotNull @Valid DadosEndereco endereco
) {
}
