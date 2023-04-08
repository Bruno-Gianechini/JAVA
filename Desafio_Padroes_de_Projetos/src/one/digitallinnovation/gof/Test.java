package one.digitallinnovation.gof;

public class Test {
    public static void main(String[] args) {

        System.out.println("\n LAZY:");
        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("\n EAGER:");
        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("\n LAZY HOLDER:");
        singletonLazyHolder lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = singletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

    }
}
