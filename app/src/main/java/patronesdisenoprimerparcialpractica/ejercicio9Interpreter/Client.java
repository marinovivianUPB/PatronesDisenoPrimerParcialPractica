package patronesdisenoprimerparcialpractica.ejercicio9Interpreter;

public class Client {
    public static void main(String[] args) {
        String msg = "1 2 3 4 5 6 7 8 9 10";
        Traductor traductor = new Traductor(msg);
        System.out.println(traductor.traduccion());
    }
}
