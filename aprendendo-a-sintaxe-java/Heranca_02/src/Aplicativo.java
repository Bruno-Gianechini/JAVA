public class Aplicativo {
    public static void main(String[] args) throws Exception {
        
    //  PROGRAMA PRINCIPAL.    
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        
        p2.setNome("Maria");
        p2.setCurso("Informática");
        //  p2.cancelarMatricula();

        p3.setNome("Cláudio");
        p3.setSalario(2500.75);
        //  p3.receberAumento(550.20);

        p4.setNome("Fabiana");
        p4.setSetor("Estoque");
        //  p4.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
