package patronesdisenoprimerparcialpractica.ejercicio6Interpreter;

public class ExpressionQuiero extends TerminoFormato {
    @Override
    public void interpreter(Context context) {
        if(context.input.split(" ")[0].equals("Quiero")){
            context.output=context.output+" When";
            String [] aux = context.input.split(" ", 2);
            context.input=aux[1];
        }
        
    }
}
