package pl.coderslab.finalProjectCarService.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    private Long vinNumber;
    private String brand;
    private String model;
    private String color;
    private LocalDate productionDate;
    @ManyToOne
    private User user;

}
