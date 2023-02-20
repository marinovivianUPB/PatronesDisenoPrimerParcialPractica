package patronesdisenoprimerparcialpractica.ejercicio4Iterator;

import java.util.List;

public class IteratorMateria implements Iterator {

    private List<Estudiante> estudiantes;
    private int position=0;

    public IteratorMateria(List<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }

    @Override
    public boolean hasNext() {
        return position<this.estudiantes.size() && this.estudiantes.size() != 0;
    }

    @Override
    public Estudiante next() {
        return estudiantes.get(position++);
    }
    
}
