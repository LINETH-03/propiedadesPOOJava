package com.company;

public  class  Aldeano extends Personaje {
    public Aldeano() {
        setNombre("Aldeano");
        setVida("3");
    }

    @Override
    public String modificarVida() {
        String vidas = this.getVida();
        String totvidas = "El aldeano tiene "+ vidas+" vidas";

        return totvidas;
    }
}
