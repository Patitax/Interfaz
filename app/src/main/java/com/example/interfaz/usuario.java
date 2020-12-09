package com.example.interfaz;

import java.io.Serializable;

public class usuario implements Serializable {

    private String nombre;
    private String telefono;
    private String email;
    private String contra;

    public usuario(String nombre, String telefono, String email, String contra) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
