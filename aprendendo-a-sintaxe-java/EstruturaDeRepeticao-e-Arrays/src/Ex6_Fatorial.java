import java.util.Scanner;

//  INÍCIO CLASSE.
public class Ex6_Fatorial 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args)
    {
        //  INÍCIO EXERCÍCIO.

            /*  EXERCÍCIO 6 - FATORIAL.
                Faça um programa que calcule o valor resultante de um número fatorial.
                Exemplo: 4! = 4 * 3 * 3 * 1 = 24.
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner(System.in);
                int numeroDesejado;
                int contador;
                int multiplicador;
                int resultado;
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.

                System.out.println("\nDigite o número e descubra o resultado de seu fatorial: ");
                numeroDesejado = scanner.nextInt();
                contador = numeroDesejado-1;
                resultado = numeroDesejado;
                do
                {
                resultado = (resultado*contador);
                contador--;
                }
                while(contador != 1);
                
                System.out.println("\nRESULTADO:");
                System.out.println(numeroDesejado + "! é igual a: " + resultado);
                System.out.println("PROGRAMA FINALIZADO!!\n");
            //  FIM SOLUÇÃO.

        //  FIM EXERCÍCIO.
    }  
}
//  FIM CLASSE.