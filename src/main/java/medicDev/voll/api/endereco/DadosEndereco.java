package medicDev.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotNull
        String logradouro,
        @NotNull
        String cep,
        @NotNull
        String complemento,
        @NotNull
        String bairro,
        @NotNull
        String uf,
        String numero,
        String cidade
) {
}
