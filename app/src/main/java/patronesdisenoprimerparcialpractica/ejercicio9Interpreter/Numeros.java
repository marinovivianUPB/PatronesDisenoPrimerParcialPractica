package patronesdisenoprimerparcialpractica.ejercicio9Interpreter;

public class Numeros extends NumeroArabico{

    int longitud;

    public Numeros(int longitud){
        this.longitud=longitud;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1") && longitud<2 ){
            context.output=context.output+"I ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("2")){
            context.output=context.output+"II ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("3")){
            context.output=context.output+"III ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("4")){
            context.output=context.output+"IV ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("5")){
            context.output=context.output+"V ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("6")){
            context.output=context.output+"VI ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("7")){
            context.output=context.output+"VII ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("8")){
            context.output=context.output+"VIII ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("9")){
            context.output=context.output+"IX ";
            context.input=context.input.substring(1);
        } else if (context.input.startsWith("10")){
            context.output=context.output+"X ";
            context.input=context.input.substring(2);
        } 
    }
    
}
