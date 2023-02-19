package patronesdisenoprimerparcialpractica.ejercicio3Factory;

public class KitColegial implements IKit{

    private Mochila mochila;
    private Libro libro;
    private Computadora computadora;

    


    public Libro getLibro() {
        return libro;
    }

    public KitColegial setLibro(Libro libro) {
        this.libro = libro;
        return this;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public KitColegial setComputadora(Computadora computadora) {
        this.computadora = computadora;
        return this;
    }

    @Override
    public Mochila getMochila() {
        
        return mochila;
    }

    @Override
    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
        
    }

    @Override
    public void show() {
        System.out.println("-------------KIT COLEGIAL-------------");
        mochila.show();
        libro.show();
        computadora.show();
        
    }
    
}
