package com.example.ProyectoInnova.Controller;

import com.example.ProyectoInnova.Models.Restaurante;
import com.example.ProyectoInnova.Service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteService restauranteService;

    @GetMapping
    public List<Restaurante> getAllRestaurantes() {
        return restauranteService.getAllRestaurantes();
    }

    @PostMapping
    public Restaurante createRestaurante(@RequestBody Restaurante restaurante) {
        return restauranteService.saveRestaurante(restaurante);
    }

    // Otros endpoints (PUT, DELETE)
}