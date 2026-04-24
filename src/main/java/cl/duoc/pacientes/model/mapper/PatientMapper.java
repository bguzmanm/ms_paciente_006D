package cl.duoc.pacientes.model.mapper;

import cl.duoc.pacientes.dto.PatientRequestDTO;
import cl.duoc.pacientes.dto.PatientResponseDTO;
import cl.duoc.pacientes.model.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", uses = {HistoryPatientMapper.class})
public interface PatientMapper {
    PatientMapper INSTANCE = Mappers.getMapper(PatientMapper.class);

    Patient toEntity(PatientRequestDTO dto);
    PatientResponseDTO toDto(Patient patient);
    List<PatientResponseDTO> toDtoList(List<Patient> list);
}
