package com.company;

public class Elfo extends Personaje implements Guerrero {
    public Elfo() {
        setNombre("Elfo");
        setVida("3");
    }

    @Override
    public String modificarVida() {
        String vidas = this.getVida();
        String totvida = "El Elfo tiene "+ vidas+" vidas";

        return totvida;
    }

    @Override
    public String Atacar() {
        String Ataca ="El "+ this.getNombre()+" empezó a atacar";
        return Ataca;

    }
}
