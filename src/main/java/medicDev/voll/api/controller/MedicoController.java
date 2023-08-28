package medicDev.voll.api.controller;


import jakarta.validation.Valid;
import medicDev.voll.api.medico.DadosAtualizacaoMedicos;
import medicDev.voll.api.medico.DadosCadastradosMedicos;
import medicDev.voll.api.medico.Medico;
import medicDev.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")

public class MedicoController {
    @Autowired
    private MedicoRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastradosMedicos dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public List<Medico> lista(){
    return repository.findAll();
    }
    @PutMapping
    @Transactional
    public void atualiza(@RequestBody @Valid DadosAtualizacaoMedicos dados){
        var medico = repository.getReferenceById(dados.id());
        medico.atualizaInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }

}

