package com.example.ProyectoInnova.Interface;

import com.example.ProyectoInnova.Models.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findByRestauranteId(String restauranteId);

}