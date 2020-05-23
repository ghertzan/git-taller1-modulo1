package uesiglo21.taller1.testing;


import java.util.NoSuchElementException;

import uesiglo21.taller1.modelo.*;

public class TestPilaEnlazada {
    
    public static void main(String[] args) {
        
        PilaEnlazada<String> miPila = new PilaEnlazada<>();

        try{
            System.out.println(miPila.peek());
        }catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        
        
        miPila.push("Gabriel");
        miPila.push("Flavio");

        System.out.println(miPila.peek());
        
        miPila.push("Flavio");

    }
}