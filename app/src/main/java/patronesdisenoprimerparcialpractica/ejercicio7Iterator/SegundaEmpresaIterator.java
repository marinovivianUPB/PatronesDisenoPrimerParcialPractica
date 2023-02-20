package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

public class SegundaEmpresaIterator implements Iterator{

    private Empleado[] empleados;
    private int position=0;

    public SegundaEmpresaIterator(Empleado[] empleados){
        this.empleados=empleados;
    }

    @Override
    public boolean hasNext() {
        return this.empleados.length != 0 && position < this.empleados.length;
    }

    @Override
    public Empleado next() {
        return empleados[position++];
    }
    
}
