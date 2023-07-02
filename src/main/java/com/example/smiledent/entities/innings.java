package com.example.smiledent.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "innings")
public class innings {

    @Id
    @SequenceGenerator(name = "sequence_inning", sequenceName = "sequence_inning", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_inning")
    private Long id;
    private LocalDate date;
    private LocalTime hour;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_patient")
    private patient patient;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dentist")
    private dentist dentist;

    public innings() {
    }

    public innings(LocalDate date, LocalTime hour, patient patient, dentist dentist) {
        this.date = date;
        this.hour = hour;
        this.patient = patient;
        this.dentist = dentist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public patient getPatient() {
        return patient;
    }

    public void setPatient(patient patient) {
        this.patient = patient;
    }

    public dentist getDentist() {
        return dentist;
    }

    public void setDentist(dentist dentist) {
        this.dentist = dentist;
    }
}
