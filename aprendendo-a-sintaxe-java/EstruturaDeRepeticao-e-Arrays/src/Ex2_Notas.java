import java.util.Scanner;

//  INÍCIO CLASSE.
    public class Ex2_Notas 
    {
        //  INÍCIO MÉTODO.
            public static void main (String[] args)
                {
                    //  INÍCIO EXERCÍCIO 
                        /*
                        EXERCÍCIO 2.
                        Faça um programa que peça uma nota entre zero e dez.
                        Mostre uma mensagem caso o valor seja inválido e continue pedindo
                        até o usuário informar um valor válido.
                        */

                        //  INÍCIO VARIÁVEIS.
                            Scanner scanner = new Scanner(System.in);
                            int nota;
                        //  FIM VARIÁVEIS. 
                        
                        //  INÍCIO SOLUÇÃO.
                            System.out.println("Por favor digite uma nota entre 0 e 10: ");
                            nota = scanner.nextInt();

                            while (nota < 0 || nota > 10) 
                            {
                                System.out.println("Nota inválida digite novamente");
                                nota = scanner.nextInt();
                            }
                            System.out.println("Nota "+ nota + " registrada com sucesso!! \nPrograma Finalizado!!");
                        //  FIM SOLUÇÃO.
                    //  FIM EXERCÍCIO.
                }
        //  FIM MÉTODO.
    }
//  FIM CLASSE.
