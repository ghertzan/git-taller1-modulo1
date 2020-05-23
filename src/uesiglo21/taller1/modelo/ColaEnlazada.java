package uesiglo21.taller1.modelo;

import java.util.NoSuchElementException;

public class ColaEnlazada<T> implements Cola<T> {
    
    private int tam;
    private Nodo<T> frente;
    private Nodo<T> fondo;

    /**
     * Constructor Vacío
     */
    public ColaEnlazada(){
        frente = fondo = null;
        tam = 0;
    }


    @Override
    public boolean esVacio() {
        
        return tam == 0;
    }
    /**
     * desencolar, devuelve y elimina el frente de la cola y pasa al siguiente nodo.
     * @throws NoSuchElementException En el caso de que la cola esté vacía.
     * @return T información contenida en el nodo del frente de la cola.
     */
    @Override
    public T desencolar() throws NoSuchElementException {
        if(esVacio()){
            throw new NoSuchElementException("Imposible desencolar, la estructura esta vacía!");
        }else{
            T e = frente.getInfo();
            frente = frente.getSig();
            tam--;
            return e;
            
        }
    }
    /**
     * encolar, agrega un nodo a la cola, el nodo contiene el elemento. 
     * @param elemento Elenemto a encolar
     */
    @Override
    public void encolar(T elemento) {
        Nodo<T> n = new Nodo<>(elemento,null);
        if(esVacio()){
            frente = fondo = n;
        }else{
            fondo.setSig(n);
            fondo = fondo.getSig();
        }
        tam++;
    }

    public String toString(){
        Nodo<T> aux = frente;
        String s = "Información en la estructura: \n";
        while(aux != null){
            s += aux.toString() + " ";
            aux = aux.getSig();
        }

        return s;
    }
    
}