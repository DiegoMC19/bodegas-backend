package co.edu.javeriana.bodegas.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.javeriana.bodegas.dto.BodegaDto;
import co.edu.javeriana.bodegas.dto.NuevaBodegaDto;
import co.edu.javeriana.bodegas.service.BodegaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/bodegas")
@CrossOrigin(origins = "http://localhost:4200")
public class BodegaController {

    private final BodegaService bodegaService;

    public BodegaController(BodegaService bodegaService) {
        this.bodegaService = bodegaService;
    }

    @GetMapping
    public ResponseEntity<List<BodegaDto>> listar() {
        return ResponseEntity.ok(bodegaService.listar());
    }

    @PostMapping
    public ResponseEntity<BodegaDto> crear(@Valid @RequestBody NuevaBodegaDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bodegaService.crear(dto));
    }
}
