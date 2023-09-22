package br.com.bfelix.crudwiththymeleaf.services;

import br.com.bfelix.crudwiththymeleaf.models.entities.CandidatoEntity;
import br.com.bfelix.crudwiththymeleaf.repositories.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatoService {

    @Autowired
    CandidatoRepository candidatoRepository;

    public CandidatoEntity salvar(CandidatoEntity candidato) {
        return candidatoRepository.save(candidato);
    }
}
