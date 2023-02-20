package patronesdisenoprimerparcialpractica.ejercicio8SingletonMultithreadAbstractFactory;

public class CuentaPrincipal {
    private static CuentaPrincipal instance = null;
    private double cuenta=0;

    private CuentaPrincipal(){
        System.out.println("--------------------------------------------------");
        System.out.println("SE HIZO EL DEPOSITO EN LA CUENTA PRINCIPAL");
        depositar();
    }

    

    public void depositar(){
        this.cuenta=this.cuenta+1000000;
    }

    public void hacerPrestamo(double monto){
        if(monto<=cuenta){
            cuenta=cuenta-monto;
            System.out.println("SE HIZO EL PRESTAMO DE: "+monto);
        } else{
            System.out.println("LA CUENTA PRINCIPAL NO TIENE LOS FONDOS SUFICIENTES");
        }
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new CuentaPrincipal();
        }
    }

    public static CuentaPrincipal getInstance(){
        if(instance == null){
            multiThreadManage();
        }
        return instance;
    }



    public double getCuenta() {
        return cuenta;
    }



}
