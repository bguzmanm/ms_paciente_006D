package cl.duoc.pacientes.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRequestDTO {
    @NotNull
    Long id;
    @NotBlank
    String run;
    @NotBlank
    String name;
    @NotBlank
    String lastName;
    Date birthday;
    @Email
    String email;
}
