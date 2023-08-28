package medicDev.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Endereco {

    private String logradouro;
    private String cep;
    private String complemento;
    private String bairro;
    private String uf;
    private String numero;
    private String cidade;

    public Endereco(DadosEndereco dados) {
        this.logradouro=dados.logradouro();
        this.cep=dados.cep();
        this.complemento=dados.complemento();
        this.bairro=dados.bairro();
        this.uf=dados.uf();
        this.numero=dados.numero();
        this.cidade=dados.cidade();
    }

    public void autalizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro()!= null){
            this.logradouro= dados.logradouro();
        }
        else if(dados.cep()!= null){
            this.cep= dados.cep();
        }
        else if(dados.complemento()!= null){
            this.complemento= dados.complemento();
        }
        else if(dados.bairro()!= null){
            this.bairro= dados.bairro();
        }
        else if(dados.uf()!= null){
            this.uf= dados.uf();
        }
        else if(dados.numero()!= null){
            this.numero= dados.numero();
        }
        else if(dados.cidade()!= null){
            this.cidade= dados.cidade();
        }
    }
}
