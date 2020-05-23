package uesiglo21.taller1.testing;

import java.util.NoSuchElementException;

import uesiglo21.taller1.modelo.*;

public class TestColaEnlazada {
    public static void main(String[] args) {
        ColaEnlazada<String> miCola = new ColaEnlazada<>();

        try{
            miCola.desencolar();
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        miCola.encolar("Gabriel");
        miCola.encolar("Flavio");
        miCola.encolar("Mamadera");

        System.out.println(miCola.toString());

    }
}