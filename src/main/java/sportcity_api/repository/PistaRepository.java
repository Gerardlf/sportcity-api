package sportcity_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportcity_api.model.Pista;

@Repository
public interface PistaRepository extends JpaRepository<Pista, Integer> {
}
