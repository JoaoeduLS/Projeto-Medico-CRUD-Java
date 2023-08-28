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
        @Pattern(regexp = "\\d{3}.\\d{3}.\\d{3}-\\d{2}")
        String cpf,
        @NotBlank
        @Pattern(regexp = "(\\d{2})-\\d{1}\\d{4}-\\d{4}")
        String telefone,
        @NotBlank
        @Email
        String email,
        @NotBlank @Valid DadosEndereco endereco
) {
}
