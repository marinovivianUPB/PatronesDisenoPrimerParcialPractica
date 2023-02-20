package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.ArrayList;
import java.util.List;

public class PrimeraEmpresa implements IAggregate {

    private List<Empleado> empleados;

    public PrimeraEmpresa(){
        empleados = new ArrayList<>();
    }

    

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }


    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }



    @Override
    public Iterator createIterator() {
        return new PrimeraEmpresaIterator(empleados);
    }
    
}
