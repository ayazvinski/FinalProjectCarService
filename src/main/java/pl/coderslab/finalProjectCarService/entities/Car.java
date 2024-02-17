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

    public Car() {
    }

    public Car(Long vinNumber, String brand, String model, String color, LocalDate productionDate, User user) {
        this.vinNumber = vinNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionDate = productionDate;
        this.user = user;
    }

    public Long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(Long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vinNumber=" + vinNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionDate=" + productionDate +
                ", user=" + user +
                '}';
    }
}
