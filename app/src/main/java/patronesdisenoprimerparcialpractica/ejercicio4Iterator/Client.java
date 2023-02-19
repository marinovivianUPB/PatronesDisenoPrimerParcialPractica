package patronesdisenoprimerparcialpractica.ejercicio4Iterator;

public class Client {
    public static void main(String[] args) {
        Materia mate = new Materia("Matematica");
    Materia leng = new Materia("Lenguaje");
    Materia hist = new Materia("Historia");
    Materia eng = new Materia("Ingles");

    Estudiante a = new Estudiante("Jose Ariel", "1234");
    Estudiante b = new Estudiante("Juan Valderrama", "2345");
    Estudiante c = new Estudiante("Ruben Orozco", "3456");
    Estudiante d = new Estudiante("Carla Perez", "4567");
    Estudiante e = new Estudiante("Mariel Mendoza", "5678");

    mate.addEstudiante(a);
    leng.addEstudiante(b);
    hist.addEstudiante(c);
    eng.addEstudiante(d);
    mate.addEstudiante(e);
    eng.addEstudiante(b);
    leng.addEstudiante(c);
    hist.addEstudiante(d);

    System.out.println("-------------------------LISTAS----------------------------");

    Iterator iterator;

    iterator=mate.createIterator();

    mate.show();
    while(iterator.hasNext()){
        Estudiante aux = (Estudiante) iterator.next();
        aux.show();
    }

    iterator=leng.createIterator();

    leng.show();
    while(iterator.hasNext()){
        Estudiante aux = (Estudiante) iterator.next();
        aux.show();
    }

    iterator=hist.createIterator();

    hist.show();
    while(iterator.hasNext()){
        Estudiante aux = (Estudiante) iterator.next();
        aux.show();
    }

    iterator=eng.createIterator();

    eng.show();
    while(iterator.hasNext()){
        Estudiante aux = (Estudiante) iterator.next();
        aux.show();
    }

    }
}
