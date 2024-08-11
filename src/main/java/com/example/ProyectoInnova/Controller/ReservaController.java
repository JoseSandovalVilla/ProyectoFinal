package com.example.ProyectoInnova.Controller;

import com.example.ProyectoInnova.Models.Reserva;
import com.example.ProyectoInnova.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping
    public Reserva createReserva(@RequestBody Reserva reserva) {
        return reservaService.saveReserva(reserva);
    }

    @GetMapping("/restaurante/{id}")
    public List<Reserva> getReservasByRestaurante(@PathVariable String id) {
        return reservaService.getReservasByRestauranteId(id);
    }

    @PutMapping("/{id}")
    public Reserva updateReserva(@PathVariable String id, @RequestBody Reserva reserva) {
        return reservaService.updateReserva(id, reserva);
    }

    @DeleteMapping("/{id}")
    public void deleteReserva(@PathVariable String id) {
        reservaService.deleteReserva(id);
    }
}
