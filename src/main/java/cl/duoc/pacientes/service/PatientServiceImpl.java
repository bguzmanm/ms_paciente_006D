package cl.duoc.pacientes.service;

import cl.duoc.pacientes.dto.PatientRequestDTO;
import cl.duoc.pacientes.dto.PatientResponseDTO;
import cl.duoc.pacientes.model.mapper.PatientMapper;
import cl.duoc.pacientes.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository repository;
    private final PatientMapper mapper;

    @Override
    public PatientResponseDTO getById(Long id) {
        return mapper.toDto(
                repository.findById(id).orElse(null)
        );
    }

    @Override
    public List<PatientResponseDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public PatientResponseDTO create(PatientRequestDTO dto) {
        if (repository.existsById(dto.getId())) {
            return null;
        }
        return mapper.toDto(
                repository.save(
                        mapper.toEntity(dto)
                )
        );
    }

    @Override
    public PatientResponseDTO update(PatientRequestDTO dto) {
        if (!repository.existsById(dto.getId())) {
            return null;
        }
        return mapper.toDto(
                repository.save(
                        mapper.toEntity(dto)
                )
        );
    }

    @Override
    public boolean delete(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}
