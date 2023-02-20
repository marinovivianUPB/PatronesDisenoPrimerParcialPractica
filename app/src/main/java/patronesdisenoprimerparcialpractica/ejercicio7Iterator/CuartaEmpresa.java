package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.Stack;

public class CuartaEmpresa implements IAggregate {

    Stack<Empleado> empleados;

    public CuartaEmpresa(){
        empleados = new Stack<>();
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public CuartaEmpresaIterator createIterator() {
        return new CuartaEmpresaIterator(empleados);
    }



    public Stack<Empleado> getEmpleados() {
        return empleados;
    }



    public void setEmpleados(Stack<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}
