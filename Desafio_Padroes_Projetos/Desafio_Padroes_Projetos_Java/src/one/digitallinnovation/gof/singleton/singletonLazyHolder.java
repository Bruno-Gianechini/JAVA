package one.digitallinnovation.gof.singleton;
//  Faz uma verificação se estiver vazio antes de instanciar
public class singletonLazyHolder {

    private static class InstanceHolder {
    public static singletonLazyHolder instancia = new singletonLazyHolder ();
}

    private singletonLazyHolder () {}
    
    public static singletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
