package patronesdisenoprimerparcialpractica.ejercicio5Builder;

public class Client {
    public static void main(String[] args) {
        Cocinero chef = new Cocinero();

        ParrillaBife bife = new ParrillaBife();
        ParrillaLomito lomito = new ParrillaLomito();
        ParrillaTira tira = new ParrillaTira();

        chef.setTipoParrilla(bife);
        chef.buildParrilla();
        Parrilla p1 = chef.getParrilla();
        p1.show();

        chef.setTipoParrilla(lomito);
        chef.buildParrilla();
        Parrilla p2 = chef.getParrilla();
        p2.show();

        chef.setTipoParrilla(tira);
        chef.buildParrilla();
        Parrilla p3 = chef.getParrilla();
        p3.show();
    }
}
