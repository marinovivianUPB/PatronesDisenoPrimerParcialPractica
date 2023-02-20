package patronesdisenoprimerparcialpractica.ejercicio7Iterator;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan Quinto", "17LP");
        Empleado e2 = new Empleado("Juan Primero", "16LP");
        Empleado e3 = new Empleado("Juan Segundo", "15LP");
        Empleado e4 = new Empleado("Juan Tercero", "14LP");
        Empleado e5 = new Empleado("Juan Cuarto", "13LP");
        Empleado e6 = new Empleado("Juan Sexto", "12LP");
        Empleado e7 = new Empleado("Juan Decimo", "11LP");
        Empleado e8 = new Empleado("Juan Noveno", "10LP");

        PrimeraEmpresa primera = new PrimeraEmpresa();
        primera.addEmpleado(e1);
        primera.addEmpleado(e2);

        SegundaEmpresa segunda = new SegundaEmpresa(2);
        segunda.addEmpleado(e3);
        segunda.addEmpleado(e4);
        
        TerceraEmpresa tercera = new TerceraEmpresa();
        tercera.addEmpleado(e5);
        tercera.addEmpleado(e6);

        CuartaEmpresa cuarta = new CuartaEmpresa();
        cuarta.addEmpleado(e7);
        cuarta.addEmpleado(e8);

        Map<String, Empleado> nuevaEmpresa = new HashMap<>();

        Iterator iterator = primera.createIterator();
        while(iterator.hasNext()){
            Empleado aux = iterator.next();
            aux.show();
            nuevaEmpresa.put(aux.getCi(), aux);
        }

        iterator = segunda.createIterator();
        while(iterator.hasNext()){
            Empleado aux = iterator.next();
            aux.show();
            nuevaEmpresa.put(aux.getCi(), aux);
        }

        iterator = tercera.createIterator();
        while(iterator.hasNext()){
            Empleado aux = iterator.next();
            aux.show();
            nuevaEmpresa.put(aux.getCi(), aux);
        }

        iterator = cuarta.createIterator();
        while(iterator.hasNext()){
            Empleado aux = iterator.next();
            aux.show();
            nuevaEmpresa.put(aux.getCi(), aux);
        }

        for(String key:nuevaEmpresa.keySet()){
            System.out.println("---------NUEVA EMPRESA-----------------------");
            nuevaEmpresa.get(key).show();
        }

    }
    
}
