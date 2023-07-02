package com.example.smiledent.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "dentist")
public class dentist {

    @Id
    @SequenceGenerator(name = "sequence_dentist", sequenceName = "sequence_dentist", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_dentist")

    private Long id;
    private String name;
    private String lastname;
    private Integer enrolment;

    @OneToMany(mappedBy = "dentist")
    @JsonIgnore
    private Set<innings> innings;

    public dentist() {
    }

    public dentist(String name, String lastname, Integer enrolment) {
        this.name = name;
        this.lastname = lastname;
        this.enrolment = enrolment;
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

    public Integer getEnrolment() {
        return enrolment;
    }

    public void setEnrolment(Integer enrolment) {
        this.enrolment = enrolment;
    }

    public Set<innings> getInnings() {
        return innings;
    }

    public void setInnings(Set<innings> innings) {
        this.innings = innings;
    }
}
