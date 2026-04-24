package cl.duoc.pacientes.repository;

import cl.duoc.pacientes.model.HistoryPatient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryPatientRepository extends JpaRepository<HistoryPatient, Long> {
}
