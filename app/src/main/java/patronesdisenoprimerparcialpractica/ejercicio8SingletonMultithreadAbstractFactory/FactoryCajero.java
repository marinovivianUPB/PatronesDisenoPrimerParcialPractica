package patronesdisenoprimerparcialpractica.ejercicio8SingletonMultithreadAbstractFactory;

public class FactoryCajero {
    public static ICajero createCajero(String nombreCajero, String ciCajero, String tipo){

        ICajero cajero;

        switch(tipo){
            case "vivienda":
                cajero = new CajeroVivienda();
                break;
            case "negocios":
            cajero = new CajeroNegocios();
                break;
            case "financiamiento":
            cajero = new CajeroFinanciamiento();
                break;
            case "creditos":
            cajero = new CajeroCreditos();
                break;
            default:
            cajero = new CajeroVivienda();
        }

        cajero.setCiCajero(ciCajero);
        cajero.setNombreCajero(nombreCajero);

        return cajero;

    }
}
