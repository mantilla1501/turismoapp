package com.example.turismoapp.Modelos;


import jakarta.persistence.*;

@Entity
@Table (name="Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer id;

    public  String nombre;

    public String cedula;

    public Integer rol;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String cedula, Integer rol) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }
}
