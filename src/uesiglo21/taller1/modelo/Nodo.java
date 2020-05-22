package uesiglo21.taller1.modelo;

public class Nodo<T> {
    private T info;
    private Nodo<T> sig;

    /**
     * Constructor Vacío
     */
    public Nodo(){
        info = null;
        sig = null;
    }

    /**
     * Constructor con Información
     */
    public Nodo (T info, Nodo<T> sig){
        this.info = info;
        this.sig = sig;
    }


    //Setters y Getters

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo(){
        return this.info;
    }

    public void setSig(Nodo<T> sig){
        this.sig = sig;
    }

    public Nodo<T> getSig(){
        return this.sig;
    }

    public String toString(){
        return info.toString();
    }
}