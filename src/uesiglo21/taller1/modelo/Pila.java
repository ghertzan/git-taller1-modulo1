package uesiglo21.taller1.modelo;

import java.util.NoSuchElementException;

public interface Pila<T>{
    /**
     * Corrobora que la pila esté vacía.
     * @return true si la pila está vacía, false caso contrario
     */
    public boolean isEmpty();

    /**
     * Ingresa un elemento a la Pila
     * @param elemento
     */
    public void push(T elemento);

    /**
     * Observa el tope de la pila
     * @return La informacíon que contiene el tope de la pila
     * @throws NoSuchElementException En el caso de que la pila esté vacía.
     */
    public T peek() throws NoSuchElementException;

    /**
     * Descarta el tope de la pila.
     * @throws NoSuchElementException En el caso de que la pila esté vacía.
     */
    public void pop() throws NoSuchElementException;

    /**
     * Observa el tope de la pila y lo descarta.
     * @return La información que contiene el tope de la pila.
     * @throws NoSuchElementException En el caso de que la pila esté vacía.
     */
    public T peekAndPop() throws NoSuchElementException;
}