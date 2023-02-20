package patronesdisenoprimerparcialpractica.ejercicio5Builder;

public class Cocinero {
    private BuilderParrilla builder;

    public Parrilla getParrilla(){
        return this.builder.getParrilla();
    }

    public void setTipoParrilla(BuilderParrilla builder){
        this.builder = builder;
    }

    public void buildParrilla(){
        this.builder.prepararParrilla();
        this.builder.buildGuarniciones();
        this.builder.buildSaborRefresco();
        this.builder.buildTipoCarne();
    }
}
