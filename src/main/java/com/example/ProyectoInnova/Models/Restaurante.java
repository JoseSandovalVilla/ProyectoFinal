package com.example.ProyectoInnova.Models;

import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "restaurantes")
public class Restaurante {
    @Id
    private String id;
    private String nombre;
    private String direccion;
    private List<Mesa> mesas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(List<Mesa> mesas) {
        this.mesas = mesas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}