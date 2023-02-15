import java.util.Scanner;

//  INÍCIO CLASSE.
public class Ex4_ParEImpar 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args)
    {
        //  INÍCIO EXERCÍCIO.
            
            /*  EXERCÍCIO 4 - PAR E IMPAR
                Faça um programa que peça N números inteiros,
                calcule e mostre a quantidade de números pares
                e a quantidade de números ímpares.
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner(System.in);
                int quantidadeNum;
                int contador = 0;
                int pares = 0;
                int impares = 0;
                int numeroDigitado;
                int resto;
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.
                System.out.println("Digite quantos números inteiros deverão ser analisados: ");
                quantidadeNum = scanner.nextInt();

                do
                {
                    System.out.println("\nDigite um número inteiro: ");
                    numeroDigitado = scanner.nextInt();
                    
                    resto = (numeroDigitado % 2);
                    if (resto == 0) 
                    pares++; 
                    else 
                    impares++;
                    
                    contador++;
                }
                while(contador < quantidadeNum);

                System.out.println("\nRESULTADOS");
                System.out.println("Números analisados: " + quantidadeNum);
                System.out.println("Números pares contados: " + pares);
                System.out.println("Números ímpares contados: " + impares);
                System.out.println("PROGRAMA FINALIZADO!!\n");

            //  FIM SOLUÇÃO.


        //  FIM EXERCÍCIO.
    }
    //  FIM MÉTODO.
}
//  FIM CLASSE.