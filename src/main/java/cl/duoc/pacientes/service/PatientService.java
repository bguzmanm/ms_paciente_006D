package cl.duoc.pacientes.service;

import cl.duoc.pacientes.dto.PatientRequestDTO;
import cl.duoc.pacientes.dto.PatientResponseDTO;

import java.util.List;

public interface PatientService {
    PatientResponseDTO getById(Long id);
    List<PatientResponseDTO> getAll();
    PatientResponseDTO create(PatientRequestDTO dto);
    PatientResponseDTO update(PatientRequestDTO dto);
    boolean delete(Long id);
}
