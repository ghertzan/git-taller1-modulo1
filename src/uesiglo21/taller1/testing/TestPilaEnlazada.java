package uesiglo21.taller1.testing;

import uesiglo21.taller1.modelo.*;

public class TestPilaEnlazada {
    
    public static void main(String[] args) {
        
        PilaEnlazada<String> miPila = new PilaEnlazada<>();

        System.out.println(miPila.peek());
        
        miPila.push("Gabriel");
        miPila.push("Flavio");

        System.out.println(miPila.peek());
        
        miPila.push("Flavio");

    }
}