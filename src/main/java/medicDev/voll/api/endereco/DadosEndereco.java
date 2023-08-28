package medicDev.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        @Pattern(regexp = "(\\d{5})-\\d{3}")
        String cep,
        @NotBlank
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String uf,
        String numero,
        String cidade
) {
}
