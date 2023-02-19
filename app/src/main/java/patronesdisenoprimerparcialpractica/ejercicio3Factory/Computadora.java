package patronesdisenoprimerparcialpractica.ejercicio3Factory;

public class Computadora {
    private String marca;
    private String os;

    public Computadora(String marca, String os) {
        this.marca = marca;
        this.os = os;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }

    public void show(){
        System.out.println("COMPUTADORA: "+marca+", OS: "+os);
    }

    
}
