package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.Vector;

public class TerceraEmpresa implements IAggregate {

    private Vector<Empleado> empleados;

    public TerceraEmpresa(){
        empleados = new Vector<>();
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Vector<Empleado> getEmpleados() {
        return empleados;
    }



    public void setEmpleados(Vector<Empleado> empleados) {
        this.empleados = empleados;
    }




    @Override
    public Iterator createIterator() {
        return new TerceraEmpresaIterator(empleados);
    }
    
}
