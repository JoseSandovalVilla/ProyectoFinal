package com.example.ProyectoInnova.Models;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurantes")
public class Mesa {
    private int numero;
    private int capacidad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}