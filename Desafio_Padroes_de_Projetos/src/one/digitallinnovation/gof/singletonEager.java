package one.digitallinnovation.gof;
//  Instancia direto para quando for chamado já estar pronto
public class singletonEager {
    private static singletonEager instancia = new singletonEager();

    private singletonEager(){}
    
    public static singletonEager getInstancia(){
        return instancia;    
    }
        
    }

