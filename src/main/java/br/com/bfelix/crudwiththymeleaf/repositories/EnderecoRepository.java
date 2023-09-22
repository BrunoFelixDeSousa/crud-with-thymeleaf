package br.com.bfelix.crudwiththymeleaf.repositories;

import br.com.bfelix.crudwiththymeleaf.models.entities.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
