package com.spring.localization.controller;

import com.spring.localization.locales.Translator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping()
    public String home() {
        return Translator.toLocale("welcome");
    }

}
