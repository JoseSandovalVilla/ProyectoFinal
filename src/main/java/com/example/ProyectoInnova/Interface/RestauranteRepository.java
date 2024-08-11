package com.example.ProyectoInnova.Interface;

import com.example.ProyectoInnova.Models.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteRepository extends MongoRepository<Restaurante, String> {

}
