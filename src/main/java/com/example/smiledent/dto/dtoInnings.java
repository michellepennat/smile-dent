package com.example.smiledent.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

public class dtoInnings {

    private Long id;
    @NotNull
    public LocalDate date;
    @NotNull
    public LocalTime hour;
    @NotNull
    public dtoPatient patient;
    @NotNull
    public dtoDentist dentist;

    public Long getId() {
        return id;
    }
}
