package one.digitallinnovation.gof.strategy;

public class Test {
    public static void main(String[] args) {
        
        //
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        System.out.println("\n MOVIMENTAÇÃO DEFENSIVA 1X");
        robo.setComportamento(defensivo);
        robo.mover();
        
        System.out.println("\n MOVIMENTAÇÃO NORMAL 2X");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("\n MOVIMENTAÇÃO AGRESSIVA 3X");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
