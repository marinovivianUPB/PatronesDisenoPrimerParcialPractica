package patronesdisenoprimerparcialpractica.ejercicio6Interpreter;

public class Client {
    public static void main(String[] args) {
        String msg = "Como administrador Quiero generar un reporte diario Para evaluar las ganancias";
        Traductor traductor = new Traductor(msg);
        System.out.println(traductor.traduccion());
    }
}
