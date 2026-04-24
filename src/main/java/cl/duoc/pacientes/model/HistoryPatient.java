package cl.duoc.pacientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="history_patient")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_history")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Patient patient;

    String address;
    String phone;    @Column(name="blood_type")
    String bloodType;
}
