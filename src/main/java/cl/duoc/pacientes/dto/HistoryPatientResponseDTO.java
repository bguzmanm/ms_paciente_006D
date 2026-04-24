package cl.duoc.pacientes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryPatientResponseDTO {
    private Long id;
    private Long patientId;
    private String address;
    private String phone;
    private String bloodType;
}
