package patronesdisenoprimerparcialpractica.ejercicio6Interpreter;

public class ExpressionComo extends TerminoFormato {

    @Override
    public void interpreter(Context context) {
        if(context.input.split(" ")[0].equals("Como")){
            context.output=context.output+"Given";
            String [] aux = context.input.split(" ", 2);
            context.input=aux[1];
        }
        
    }
    
}
