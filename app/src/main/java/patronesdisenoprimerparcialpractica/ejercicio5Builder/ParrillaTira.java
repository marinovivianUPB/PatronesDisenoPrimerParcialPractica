package patronesdisenoprimerparcialpractica.ejercicio5Builder;

public class ParrillaTira extends BuilderParrilla{
    @Override
    public void buildGuarniciones() {
        this.parrilla.setGuarniciones("Fideo");
        
    }

    @Override
    public void buildSaborRefresco() {
        this.parrilla.setSaborRefresco("Coca Cola");
        
    }

    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoDeCarne("Tira de Carne");
        
    }
    
}
