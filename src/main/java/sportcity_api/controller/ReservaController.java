package sportcity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sportcity_api.model.Reserva;
import sportcity_api.repository.ReservaRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    //Obtener todas las reservas
    @GetMapping
    public List<Reserva> getReservas() {
        return reservaRepository.findAll();
    }

    //Obtener reservas segun id usuario
    @GetMapping("/usuario/{usuarioId}")
    public List<Reserva> getReservasPorUsuario(@PathVariable String usuarioId) {
        return reservaRepository.findByUsuarioId(usuarioId);
    }


    //Crear un nueva reserva (metodo POST)
    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva nuevaReserva) {

        //Guardo la reserva en la lista de reservas
        return reservaRepository.save(nuevaReserva);
    }

    //Actualizar una reserva
    @PutMapping("/{id}")
    public Reserva actualizarReserva(@PathVariable int id, @RequestBody Reserva reservaActualizada) {
        return reservaRepository.findById(id)
                .map(reserva -> {
                    reserva.setPistaId(reservaActualizada.getPistaId());
                    reserva.setPistaNombre(reservaActualizada.getPistaNombre());
                    reserva.setFecha(reservaActualizada.getFecha());
                    reserva.setHora(reservaActualizada.getHora());
                    reserva.setNombreCliente(reservaActualizada.getNombreCliente());
                    reserva.setTelefonoCliente(reservaActualizada.getTelefonoCliente());
                    reserva.setDeporte(reservaActualizada.getDeporte());
                    reserva.setComentario(reservaActualizada.getComentario());
                    reserva.setUsuarioId(reservaActualizada.getUsuarioId());
                    return reservaRepository.save(reserva);
                })
                .orElse(null);
    }

    //Borrar reserva
    @DeleteMapping("/{id}")
    public String borrarReserva(@PathVariable int id) {
        if (reservaRepository.existsById(id)) {
            reservaRepository.deleteById(id);
            return "Reserva borrada con éxito!!!!";
        }
        return "No se encontró la reserva";
    }


}
