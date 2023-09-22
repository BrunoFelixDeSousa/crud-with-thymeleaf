package br.com.bfelix.crudwiththymeleaf.controllers;


import br.com.bfelix.crudwiththymeleaf.models.entities.CandidatoEntity;
import br.com.bfelix.crudwiththymeleaf.services.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/candidato")
public class CandidatoController {

    @Autowired
    CandidatoService candidatoService;

    @GetMapping
    public String cadastrarCandidato() {
        return "cadastrarCandidato";
    }

    @PostMapping
    public String salvarCandidato(CandidatoEntity candidato) {
        candidatoService.salvar(candidato);
        return "redirect:/";
    }
}
