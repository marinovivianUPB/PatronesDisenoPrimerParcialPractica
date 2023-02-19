package patronesdisenoprimerparcialpractica.ejercicio3Factory;

public class KitEscolarCreator extends KitCreator{

    @Override
    public IKit armarKit() {
        KitEscolar kit = new KitEscolar();
        kit.setMochila(new Mochila(8, "Small"));
        kit.setCuaderno(new Cuaderno("Cuadriculado", 200))
        .setDeportivo(new Deportivo("M", "Azul y Blanco", 4));
        return kit;
    }

    public IKit armarKitConTalla(String talla){
        KitEscolar kit = (KitEscolar) armarKit();
        kit.getDeportivo().setTalla(talla);
        return kit;
    }
    
}
