package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.Vector;

public class TerceraEmpresaIterator implements Iterator{

    private Vector<Empleado> empleados;
    private int position=0;

    public TerceraEmpresaIterator(Vector<Empleado> empleados){
        this.empleados=empleados;
    }

    @Override
    public boolean hasNext() {
        return position < empleados.size() && empleados.size() != 0;
    }

    @Override
    public Empleado next() {
        return empleados.get(position++);
    }
    
}
