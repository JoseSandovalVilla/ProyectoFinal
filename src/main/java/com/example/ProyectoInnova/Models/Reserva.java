package com.example.ProyectoInnova.Models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reservas")
public class Reserva {

    @Id
    private String id;
    private String restauranteId;
    private String usuario;
    private LocalDateTime fechaHora;
    private int numeroPersonas;

    public Reserva() {
    }

    public Reserva(String restauranteId, String usuario, LocalDateTime fechaHora, int numeroPersonas) {
        this.restauranteId = restauranteId;
        this.usuario = usuario;
        this.fechaHora = fechaHora;
        this.numeroPersonas = numeroPersonas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(String restauranteId) {
        this.restauranteId = restauranteId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }
}
