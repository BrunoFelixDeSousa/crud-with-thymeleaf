package br.com.bfelix.crudwiththymeleaf.repositories;

import br.com.bfelix.crudwiththymeleaf.models.entities.CandidatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<CandidatoEntity, Long> {
}
