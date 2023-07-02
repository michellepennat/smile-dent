package com.example.smiledent.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.apache.log4j.Logger;

@RestController
@RequestMapping("/dentist")
public class controllerDentist {

    private static final Logger LOG = Logger.getLogger(controllerDentist.class);
}
