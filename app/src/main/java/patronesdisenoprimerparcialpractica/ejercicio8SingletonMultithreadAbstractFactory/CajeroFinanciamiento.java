package patronesdisenoprimerparcialpractica.ejercicio8SingletonMultithreadAbstractFactory;

public class CajeroFinanciamiento implements ICajero{

    private String nombreCajero;
    private String ciCajero;

    

    @Override
    public String getCiCajero() {
        return ciCajero;
    }

    @Override
    public void setCiCajero(String ciCajero) {
       this.ciCajero=ciCajero;
    }

    @Override
    public String getNombreCajero() {
        return nombreCajero;
    }

    @Override
    public void hacerPrestamo(double monto) {
        System.out.println("-------------PRESTAMO FINANCIAMIENTO---------------");
        CuentaPrincipal.getInstance().hacerPrestamo(monto);
        
    }

    @Override
    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero=nombreCajero;
    }

    @Override
    public void show() {
        System.out.println("-------------------------");
        System.out.println("PRESTAMOS DE FINANCIAMIENTO");
        System.out.println("A CARGO DE: "+nombreCajero+" ("+ciCajero+")");
    }
}
