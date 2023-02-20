package patronesdisenoprimerparcialpractica.ejercicio9Interpreter;

import java.util.ArrayList;
import java.util.List;

public class Traductor extends NumeroArabico {

    private List<NumeroArabico> secuenciaNumerosArabicos = new ArrayList<>();
    private Context context;

    public Traductor(String secuenciaNumerosArabicosOG){
        context = new Context(secuenciaNumerosArabicosOG.replace(" ", ""));
        for (String msg: secuenciaNumerosArabicosOG.split(" ")){
            switch(msg){
                case "1":
                secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                case "2":
                secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                case "3":
                secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "4":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "5":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "6":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "7":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "8":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "9":
                    secuenciaNumerosArabicos.add(new Numeros(1));
                    break;
                    case "10":
                    secuenciaNumerosArabicos.add(new Numeros(2));
                    break;
                default:
                secuenciaNumerosArabicos.add(new NoValido(msg.length()));
                    break;
                
                }
        }
    }

    public String traduccion(){
        for(NumeroArabico numeroArabico:secuenciaNumerosArabicos){
            numeroArabico.interpreter(context);
        }
        return context.output;
    }


    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        
    }
    
}
