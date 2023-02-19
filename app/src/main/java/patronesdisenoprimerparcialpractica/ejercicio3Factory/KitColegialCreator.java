package patronesdisenoprimerparcialpractica.ejercicio3Factory;


public class KitColegialCreator extends KitCreator{

    @Override
    public IKit armarKit() {
        KitColegial kit = new KitColegial();
        kit.setMochila(new Mochila(6, "Grande"));
        kit.setLibro(new Libro("Charlie Brown", "Literatura Clasica"))
        .setComputadora(new Computadora("DELL", "Window 10"));
        return kit;
    }
    
}
