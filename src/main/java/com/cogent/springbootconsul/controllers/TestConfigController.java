package com.cogent.springbootconsul.controllers;


import com.cogent.springbootconsul.config.F1soft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConfigController {
    @Autowired
    private F1soft f1softConfig;

    @GetMapping("f1soft")
    private F1soft getF1softData(){
        return f1softConfig;
    }
}
