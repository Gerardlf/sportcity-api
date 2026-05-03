package sportcity_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sportcity_api.model.Reserva;

import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    List<Reserva> findByUsuarioId(String usuarioId);

    boolean existsByPistaIdAndFechaAndHora(int pistaId, String fecha, String hora);
}
