package patronesdisenoprimerparcialpractica.ejercicio4Iterator;

public class Estudiante {
    private String nombre;
    private String ci;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCodigo(String ci) {
        this.ci = ci;
    }

    public Estudiante(String nombre, String ci){
        this.nombre=nombre;
        this.ci=ci;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ci == null) ? 0 : ci.hashCode());
        return result;
    }

    public void show(){
        System.out.println("-----------------------------------");
        System.out.println("NOMBRE: "+nombre);
        System.out.println("CI: "+ci);
    }

    
}
