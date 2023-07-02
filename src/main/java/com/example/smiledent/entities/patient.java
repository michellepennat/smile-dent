package com.example.smiledent.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "patients")
public class patient {

    @Id
    @SequenceGenerator(name = "sequence_patient", sequenceName = "sequence_patient", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_patient")

    private Long id;
    private String name;
    private String lastname;
    private int cc;
    private LocalDate dischargeDate;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_home")
    private home home;

    @OneToMany(mappedBy = "patients")
    @JsonIgnore
    private Set<innings> innings;

    public patient() {
    }

    public patient(String name, String lastname, int cc, LocalDate dischargeDate) {
        this.name = name;
        this.lastname = lastname;
        this.cc = cc;
        this.dischargeDate = dischargeDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public com.example.smiledent.entities.home getHome() {
        return home;
    }

    public void setHome(com.example.smiledent.entities.home home) {
        this.home = home;
    }

    public Set<com.example.smiledent.entities.innings> getInnings() {
        return innings;
    }

    public void setInnings(Set<com.example.smiledent.entities.innings> innings) {
        this.innings = innings;
    }
}
