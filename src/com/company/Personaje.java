package com.company;

public abstract class Personaje {
    private String nombre;
    private String vida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVida() {
        return vida;
    }

    public void setVida(String vida) {
        this.vida = vida;
    }

    public abstract String modificarVida();
}
