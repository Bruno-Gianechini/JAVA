package one.digitallinnovation.gof.singleton;
//  Faz uma verificação se estiver vazio antes de instanciar
public class singletonLazy {
    private static singletonLazy instancia;
    private singletonLazy(){}
    
    public static singletonLazy getInstancia(){
        if (instancia == null) {
            instancia = new singletonLazy();
        }
        return instancia;
    }
}
