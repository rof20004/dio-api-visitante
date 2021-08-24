package br.com.digitalinnovationone.apivisitante.controller;

import br.com.digitalinnovationone.apivisitante.dto.VisitanteRequestDto;
import br.com.digitalinnovationone.apivisitante.entity.Visitante;
import br.com.digitalinnovationone.apivisitante.service.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visitante criar(@RequestBody VisitanteRequestDto dto) {
        return service.criar(dto);
    }

}
