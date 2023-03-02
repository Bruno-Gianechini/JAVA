//  INÍCIO CLASSE.
    public class Central
    {
        /*
            CENTRAL DE MÉTODOS.
            Este arquivo serve para incluir os parâmetros nos métodos 
            para que a sua execução ocorra de forma adequada.
        */
        
        //  INÍCIO MÉTODO.
            public static void main(String[] args) 
            {   

            //  INÍCIO MENSAGEM.
                System.out.println("\n");
                Mensagem.hora(00);
            //  FIM MENSAGEM.

            //  INÍCIO CALCULADORA.
                System.out.println("\nCALCULADORA:\n");
                Calculadora.somar(1,2);
                Calculadora.subtrair(3,2);
                Calculadora.multiplicar(3.0 , 0.5);
                Calculadora.dividir(14.0, 68.0);
            //  FIM CALCULADORA.

            //  INÍCIO IMPRÉSTIMO.
                System.out.println("\n\nSIMULADOR EMPRÉSTIMO: \n");
                Emprestimo.emprestimo(1000., 10, .5);
                System.out.println("\nSIMULADOR EMPRÉSTIMO FINALIZADO!!\n\n");;
            }
    }
//  FIM CLASSE.