package cl.duoc.pacientes.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryPatientRequestDTO {
    @NotNull
    private Long id;
    @NotNull
    private Long patientId;
    @NotBlank
    private String address;
    @NotBlank
    private String phone;
    @NotBlank
    private String bloodType;
}
