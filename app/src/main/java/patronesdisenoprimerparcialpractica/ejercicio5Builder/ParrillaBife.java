package patronesdisenoprimerparcialpractica.ejercicio5Builder;

public class ParrillaBife extends BuilderParrilla {

    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Papas Fritas");
        
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Coca Cola");
        
    }

    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("Bife");
        
    }
    
}
