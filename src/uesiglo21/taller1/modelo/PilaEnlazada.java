package uesiglo21.taller1.modelo;

import java.util.NoSuchElementException;

public class PilaEnlazada<T> implements Pila<T> {

    private Nodo<T> tos;
    private int size = 0;

    // Constructores

    /**
     * Constructor Vacío
     */
    public PilaEnlazada(){
        tos = null;
    }

    /**
     * Constructor con elementos
     */
    public PilaEnlazada(Nodo<T> nodo){
        tos = nodo;
        size++;
    }

    @Override
    public boolean isEmpty() {
        
        return size == 0;
    }

    @Override
    public void push(T elemento) {
        tos = new Nodo<>(elemento, tos);
        size++;
    }

    @Override
    public T peek() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("La pila está vacía!");
        }else{
            return tos.getInfo();
        }
        
    }

    @Override
    public void pop() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("La pila está vacía!");
        }else{
            tos = tos.getSig();
            size--;
        }
    }

    @Override
    public T peekAndPop() throws NoSuchElementException {
        if(isEmpty()){
            throw new NoSuchElementException("La pila está vacía");
        }else{
            T ret = tos.getInfo();
            this.pop();
            return ret;
        }
        
    }
    
}