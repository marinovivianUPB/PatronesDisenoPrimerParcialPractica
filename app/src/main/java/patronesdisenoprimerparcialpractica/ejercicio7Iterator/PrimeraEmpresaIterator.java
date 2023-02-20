package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.List;

public class PrimeraEmpresaIterator implements Iterator {


    private List<Empleado> empleados;
    private int position = 0;

    public PrimeraEmpresaIterator(List<Empleado> empleados){
        this.empleados = empleados;
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() != 0 && position < this.empleados.size();
    }

    @Override
    public Empleado next() {
        return empleados.get(position++);
    }
    
}
