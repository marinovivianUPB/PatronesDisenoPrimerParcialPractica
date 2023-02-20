package patronesdisenoprimerparcialpractica.ejercicio8SingletonMultithreadAbstractFactory;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        String v="vivienda";
        String c="creditos";
        String n="negocios";
        String f="financiamiento";

        System.out.println("SALDO EN CUENTA PRINCIPAL: "+CuentaPrincipal.getInstance().getCuenta());

        Thread.sleep(200,0);

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroCreditos c1 = (CajeroCreditos) FactoryCajero.createCajero("Juan Valdez", "123LP", c);
                c1.hacerPrestamo(200000);
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroVivienda v1 = (CajeroVivienda) FactoryCajero.createCajero("Luis Bravo", "12LP", v);
                v1.hacerPrestamo(400000);
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroNegocios n1 = (CajeroNegocios) FactoryCajero.createCajero("Luis Torrico", "22LP", n);
                n1.hacerPrestamo(400000);
            }
        });

        
        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CajeroFinanciamiento f1 = (CajeroFinanciamiento) FactoryCajero.createCajero("Luis Bravo", "190LP", f);

                f1.hacerPrestamo(400000);
            }
        });
        
user1.start();
user2.start();
user3.start();
user4.start();

Thread.sleep(200,0);

System.out.println("SALDO EN CUENTA PRINCIPAL: "+CuentaPrincipal.getInstance().getCuenta());
        
    }
}
