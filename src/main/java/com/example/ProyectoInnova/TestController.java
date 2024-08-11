package com.example.ProyectoInnova;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @GetMapping("/hola/{nombre}")
    public String obtenerNombre(@PathVariable String nombre) {
        return "hola, "+ nombre + "!";
    }
}
