package cl.duoc.pacientes.repository;

import cl.duoc.pacientes.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
