package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.Stack;

public class CuartaEmpresaIterator implements Iterator{

    private Stack<Empleado> empleados;

    public CuartaEmpresaIterator(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        return !empleados.isEmpty();
    }

    @Override
    public Empleado next() {
        return empleados.pop();
    }
    
    
}
