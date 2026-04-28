package sportcity_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportcity_api.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
