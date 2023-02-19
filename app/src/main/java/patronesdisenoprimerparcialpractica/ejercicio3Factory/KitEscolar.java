package patronesdisenoprimerparcialpractica.ejercicio3Factory;

public class KitEscolar implements IKit{

    private Mochila mochila;
    private Cuaderno cuaderno;
    private Deportivo deportivo;

    public Cuaderno getCuaderno() {
        return cuaderno;
    }

    public KitEscolar setCuaderno(Cuaderno cuaderno) {
        this.cuaderno = cuaderno;
        return this;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public KitEscolar setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
        return this;
    }

    @Override
    public Mochila getMochila() {
        return mochila;
    }

    @Override
    public void setMochila(Mochila mochila) {
        this.mochila=mochila;
    }

    @Override
    public void show() {
        System.out.println("--------------KIT ESCOLAR------------");
        mochila.show();
        cuaderno.show();
        deportivo.show();
    }
    
}
