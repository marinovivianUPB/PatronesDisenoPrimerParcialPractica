package patronesdisenoprimerparcialpractica.ejercicio10IteratorSingleton;

import java.util.Stack;

public class CabinaIterator implements Iterator {

    Stack<Vehiculo> registrados;

    public CabinaIterator(Stack<Vehiculo> registrados){
        this.registrados=registrados;
    }

    @Override
    public boolean hasNext() {
        return !registrados.isEmpty();
    }

    @Override
    public Vehiculo next() {
        return registrados.pop();
    }
    
}
