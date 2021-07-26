package com.company;

public class Heroe extends Personaje implements Guerrero{
    public Heroe() {
        setNombre("Heroe");
        setVida("3");
    }

    @Override
    public String modificarVida() {
        String vidas = this.getVida();
        String totvid = "El aldeano tiene "+ vidas+" vidas";
        return totvid;
    }

    @Override
    public String Atacar() {
        String Ataca ="El "+ this.getNombre()+" empezó a atacar";
        return Ataca;

    }
}
