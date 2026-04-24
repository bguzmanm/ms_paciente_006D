package cl.duoc.pacientes.dto;

import cl.duoc.pacientes.model.HistoryPatient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientResponseDTO {
    Long id;
    String run;
    String name;
    String lastName;
    Date birthday;
    String email;

    List<HistoryPatientResponseDTO> history;
}
