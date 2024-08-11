package com.example.ProyectoInnova.Service;

import com.example.ProyectoInnova.Interface.RestauranteRepository;
import com.example.ProyectoInnova.Models.Restaurante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public List<Restaurante> getAllRestaurantes() {
        return restauranteRepository.findAll();
    }

    public Restaurante saveRestaurante(Restaurante restaurante) {
        return restauranteRepository.save(restaurante);
    }

    // Otros métodos de negocio
}
