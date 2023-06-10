package med.voll.api.controller;

import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    MedicoRepository repository;
    @GetMapping("/")
    public void consulta(){
        System.out.println("sucesso GET");
    }

    @Transactional
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){

        repository.save(new Medico(dados));
    }
}
