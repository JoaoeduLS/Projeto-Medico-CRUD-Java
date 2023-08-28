package medicDev.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import medicDev.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
