package patronesdisenoprimerparcialpractica.ejercicio10IteratorSingleton;

public class Client {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("123A", "AK45", "Toyota", "Marengo");
        Vehiculo v2 = new Vehiculo("123B", "M1918", "Suzuki", "Plomo");
        Vehiculo v3 = new Vehiculo("123C", "MP40", "Mitsubishi", "Negro");
        Vehiculo v4 = new Vehiculo("123D", "M1895", "Ferrari", "Rojo");
        Vehiculo v5 = new Vehiculo("123E", "Breda30", "Peugeot", "Azul Marino");
        Vehiculo v6 = new Vehiculo("123F", "C96", "Ford", "Verde");

        Cabina.getInstance().pagarPeaje(v1);
        Cabina.getInstance().pagarPeaje(v2);
        Cabina.getInstance().pagarPeaje(v3);
        Cabina.getInstance().pagarPeaje(v4);
        Cabina.getInstance().pagarPeaje(v5);
        Cabina.getInstance().pagarPeaje(v6);

        //la iteracion se activa automaticamente cuando ya se tienen 6 vehiculos
        
    }
}
