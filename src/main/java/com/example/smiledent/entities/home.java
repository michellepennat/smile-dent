package com.example.smiledent.entities;

import javax.persistence.*;

@Entity
@Table(name = "home")
public class home {

    @Id
    @SequenceGenerator(name = "sequence_home", sequenceName = "sequence_home", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_home")
    private Long id;
    private String street;
    private int numberStreet;
    private String city;
    private String department;

    public home() {
    }

    public home(Long id, String street, int numberStreet, String city, String department) {
        this.id = id;
        this.street = street;
        this.numberStreet = numberStreet;
        this.city = city;
        this.department = department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberStreet() {
        return numberStreet;
    }

    public void setNumberStreet(int numberStreet) {
        this.numberStreet = numberStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
