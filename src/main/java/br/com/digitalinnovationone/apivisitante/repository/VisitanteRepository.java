package br.com.digitalinnovationone.apivisitante.repository;

import br.com.digitalinnovationone.apivisitante.entity.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, String> {
}
