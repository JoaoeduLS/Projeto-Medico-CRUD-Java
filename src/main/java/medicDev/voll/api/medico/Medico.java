package medicDev.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import medicDev.voll.api.endereco.Endereco;

@Table(name= "medicos")
@Entity(name= "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Medico {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastradosMedicos dados) {
        this.nome= dados.nome();
        this.email= dados.email();
        this.cpf= dados.cpf();
        this.telefone= dados.telefone();
        this.endereco= new Endereco(dados.endereco());

    }

    public void atualizaInformacoes(DadosAtualizacaoMedicos dados) {
        if (dados.nome()!= null){
            this.nome= dados.nome();
        }
        else if(dados.telefone()!= null){
            this.telefone= dados.telefone();
        }
        else if(dados.endereco()!= null){
            this.endereco.autalizarInformacoes(dados.endereco());
        }
    }
}
