import java.util.Scanner;

//  INÍCIO CLASSE.
    public class Ex3_MaiorEMediaSimplificado 
{   
    //  INÍCIO MÉTODO.
        public static void main(String[] args)
        {
            //  INÍCIO EXERCÍCIO 
                    /*
                        EXERCÍCIO 3.
                        Faça um programa que leia 5 números e então
                        informe o maior número e a média entre os 5.
                    */

                    //  INÍCIO VARIÁVEIS.
                        Scanner scanner = new Scanner(System.in);
                        int numero = 0;
                        int media = 0;
                        int count = 0;
                        int maiorNum = 0;
                    //  FIM VARIÁVEIS.

                    //  INÍCIO SOLUÇÃO.
                        do
                        {
                            System.out.println("Digite um número: ");
                            numero = scanner.nextInt();
                            if (numero > maiorNum) maiorNum = numero;
                            media = media + numero;
                            count++;
                        } 
                        while (count<5);
                        
                        //  INÍCIO SAÍDA.
                            System.out.println("\nRESULTADOS:");
                            System.out.println("Média: " + (media/5));
                            System.out.println("Maior número é: " + maiorNum);
                            System.out.println("PROGRAMA FINALIZADO!!\n");
                        //  FIM SAÍDA.

                    //  FIM SOLUÇÃO.
                    
            //  FIM EXERCÍCIOS.
        }
    //  FIM MÉTODO.
}
//  FIM CLASSE.