package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Aldeano aldeano1 = new Aldeano();
        System.out.println(aldeano1.modificarVida());
        Heroe heroe1 = new Heroe();
        System.out.println(heroe1.Atacar());
        System.out.println(heroe1.modificarVida());
        Elfo elfo1 = new Elfo();
        System.out.println(elfo1.Atacar());
        System.out.println(elfo1.modificarVida());


    }
}
