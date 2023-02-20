package patronesdisenoprimerparcialpractica.ejercicio9Interpreter;

public class NoValido extends NumeroArabico{

    int longitud;

    public NoValido(int longitud){
        this.longitud=longitud;
    }

    @Override
    public void interpreter(Context context) {
        context.output=context.output+"NoValido ";
            context.input=context.input.substring(longitud);
    }
    
}
