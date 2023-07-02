package com.example.smiledent.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class dtoPatient {

    private Long id;
    @NotNull
    public String name;
    @NotNull
    public String lastname;
    public int cc;
    public LocalDate dischargeDate;
    public dtoHome home;

    public Long getId() {
        return id;
    }
}
