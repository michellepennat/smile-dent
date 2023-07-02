package com.example.smiledent.dto;

import javax.validation.constraints.NotNull;

public class dtoDentist {

    private Long id;
    @NotNull
    public String name;
    @NotNull
    public String lastname;
    public Integer enrolment;

    public Long getId() {
        return id;
    }
}
