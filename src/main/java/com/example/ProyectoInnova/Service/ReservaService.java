package com.example.ProyectoInnova.Service;

import com.example.ProyectoInnova.Interface.ReservaRepository;
import com.example.ProyectoInnova.Models.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    // Save a new reservation
    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // Get all reservations for a specific restaurant
    public List<Reserva> getReservasByRestauranteId(String restauranteId) {
        return reservaRepository.findByRestauranteId(restauranteId);
    }

    // Update an existing reservation
    public Reserva updateReserva(String id, Reserva reserva) {
        Optional<Reserva> existingReserva = reservaRepository.findById(id);
        if (existingReserva.isPresent()) {
            Reserva updatedReserva = existingReserva.get();
            updatedReserva.setRestauranteId(reserva.getRestauranteId()); // Update restaurant ID
            updatedReserva.setUsuario(reserva.getUsuario()); // Update user
            updatedReserva.setFechaHora(reserva.getFechaHora()); // Update date and time
            updatedReserva.setNumeroPersonas(reserva.getNumeroPersonas()); // Update number of people
            return reservaRepository.save(updatedReserva);
        }
        return null; // Return null if not found, or throw an exception if needed
    }

    // Delete a reservation by its ID
    public void deleteReserva(String id) {
        reservaRepository.deleteById(id);
    }
}
