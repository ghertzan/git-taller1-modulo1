package uesiglo21.taller1.modelo;

import java.util.NoSuchElementException;

public interface Cola<T> {
    public boolean esVacio();
    public T desencolar() throws NoSuchElementException;
    public void encolar(T elemento);    
}