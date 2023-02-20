package patronesdisenoprimerparcialpractica.ejercicio6Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Traductor extends TerminoFormato{
    private List<TerminoFormato> historiaUsuario = new ArrayList<>();
    private Context context;

    public Traductor(String historiaUsuarioOG){
        context = new Context(historiaUsuarioOG);
        for (String msg: historiaUsuarioOG.split(" ")){
            switch(msg){
                case "Como":
                    historiaUsuario.add(new ExpressionComo());
                    break;
                case "Quiero":
                    historiaUsuario.add(new ExpressionQuiero());
                    break;
                case "Para":
                    historiaUsuario.add(new ExpressionPara());
                    break;
                default:
                    historiaUsuario.add(new ExpressionComun());
                    break;
                
                }
        }
    }

    public String traduccion(){
        for(TerminoFormato terminoFormato:historiaUsuario){
            terminoFormato.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        
    }


}
