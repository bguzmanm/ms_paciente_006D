package cl.duoc.pacientes.controller;

import cl.duoc.pacientes.dto.PatientResponseDTO;
import cl.duoc.pacientes.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping()
    public ResponseEntity<List<PatientResponseDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
