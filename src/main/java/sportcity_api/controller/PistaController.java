package sportcity_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sportcity_api.model.Pista;
import sportcity_api.repository.PistaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pistas")
public class PistaController {

    @Autowired
    private PistaRepository pistaRepository;


    //Obtener todas las pistas

    @GetMapping
    public List<Pista> getPistas() {
        return pistaRepository.findAll();
    }

    //Filtrar por deporte (filtrar)

    @GetMapping("/deporte/{nombreDeporte}")
    public List<Pista> getPistaPorDeporte(@PathVariable String nombreDeporte) {
        return pistaRepository.findAll().stream()
                .filter(pista -> pista.getDeporte().equalsIgnoreCase(nombreDeporte))
                .collect(Collectors.toList());
    }

    //Obtener pista por ID
    @GetMapping("/{id}")
    public Pista getPistaId(@PathVariable int id) {
        return pistaRepository.findById(id).orElse(null);
    }


}
