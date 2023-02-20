package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

public class SegundaEmpresa implements IAggregate{

    private Empleado [] empleados;
    private int numEmpleados;
    private int position=0;
    

    public SegundaEmpresa(int numEmpleados) {
        this.numEmpleados = numEmpleados;
        empleados= new Empleado [numEmpleados];
    }



    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void addEmpleado(Empleado empleado){
        if(position<=numEmpleados-1){
            empleados[position++]=empleado;
        }else{
            System.out.println("SE LLENO EL CUPO DE EMPLEADOS");
        }
    }



    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }



    public int getNumEmpleados() {
        return numEmpleados;
    }



    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }



    @Override
    public SegundaEmpresaIterator createIterator() {
        return new SegundaEmpresaIterator(empleados);
    }

    
    
}
