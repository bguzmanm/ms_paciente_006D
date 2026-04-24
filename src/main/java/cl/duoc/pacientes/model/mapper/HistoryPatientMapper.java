package cl.duoc.pacientes.model.mapper;

import cl.duoc.pacientes.dto.HistoryPatientRequestDTO;
import cl.duoc.pacientes.dto.HistoryPatientResponseDTO;
import cl.duoc.pacientes.model.HistoryPatient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface HistoryPatientMapper {

    HistoryPatientMapper INSTANCE = Mappers.getMapper(HistoryPatientMapper.class);

    HistoryPatient toEntity(HistoryPatientRequestDTO dto);

    @Mapping(source = "patient.id", target = "patientId")
    HistoryPatientResponseDTO toDto(HistoryPatient patient);

    List<HistoryPatientResponseDTO> toDtoList(List<HistoryPatient> patients);
}
