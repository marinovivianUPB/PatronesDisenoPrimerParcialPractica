package patronesdisenoprimerparcialpractica.ejercicio10IteratorSingleton;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String color;

    public void show(){
        System.out.println("------------------------------------------------------------");
        System.out.println(marca+" "+modelo+" "+color+" PLACA: "+placa);
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((placa == null) ? 0 : placa.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
  
    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }
    public String getPlaca() {
        return placa;
    }
    public Vehiculo setPlaca(String placa) {
        this.placa = placa;
        return this;
    }
    public String getModelo() {
        return modelo;
    }
    public Vehiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }
    public String getMarca() {
        return marca;
    }
    public Vehiculo setMarca(String marca) {
        this.marca = marca;
        return this;
    }
    public String getColor() {
        return color;
    }
    public Vehiculo setColor(String color) {
        this.color = color;
        return this;
    }

    
}
