import java.util.Scanner;

import javax.print.attribute.standard.Media;

//  INÍCIO CLASSE.
public class Ex3_MaiorEMedia
{
    //  INÍCIO MÉTODO.
        public static void main (String[] args)
            {
                //  INÍCIO EXERCÍCIO 
                    /*
                        EXERCÍCIO 3.
                        Faça um programa que leia 5 números e então
                        informe o maior número e a média entre os 5.
                    */

                    //  INÍCIO VARIÁVEIS.
                        Scanner scanner = new Scanner(System.in);
                        int num1;
                        int num2;
                        int num3;
                        int num4;
                        int num5;
                        int media;
                        int maiorNum;
                        int total;
                    //  FIM VARIÁVEIS. 
                    
                    //  INÍCIO SOLUÇÃO (SEM REPETIÇÃO).
                        //  INÍCIO ENTRADA DE VALORES.
                            
                            System.out.println("Digite o primeiro número: ");
                            num1 = scanner.nextInt();
                            maiorNum = num1;

                            System.out.println("\nDigite o segundo número: ");
                            num2 = scanner.nextInt();
                            if (num2 > maiorNum) maiorNum = num2;

                            System.out.println("\nDigite o terceiro número: ");
                            num3 = scanner.nextInt();
                            if (num3 > maiorNum) maiorNum = num3;

                            System.out.println("\nDigite o quarto número: ");
                            num4 = scanner.nextInt();
                            if (num4 > maiorNum) maiorNum = num4;

                            System.out.println("\nDigite o quinto número: ");
                            num5 = scanner.nextInt();
                            if (num5 > maiorNum) maiorNum = num5;

                        //  FIM ENTRADA DE VALORES.

                        //  INÍCIO CÁLCULOS.
                            media = ((num1 + num2 + num3 + num4 + num5)/5);
                        //  FIM CÁLCULOS.

                        //  INÍCIO SAÍDA DE DADOS.
                            System.out.println("\nRESULTADOS: ");
                            System.out.println("A média é: " + media);
                            System.out.println("O Maior número é: " + maiorNum);
                            System.out.println("PROGRAMA FINALIZADO!! \n");
                        //  FIM SAÍDA DE DADOS.

                    //  FIM SOLUÇÃO (SEM REPETIÇÃO).       

                //  FIM EXERCÍCIO.
            }
    //  FIM MÉTODO.
}
//  FIM CLASSE.