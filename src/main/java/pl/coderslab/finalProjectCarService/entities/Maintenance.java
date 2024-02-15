package pl.coderslab.finalProjectCarService.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="maintenances")
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Car car;
    private LocalDate date;


}

