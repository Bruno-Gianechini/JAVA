import java.util.Scanner;

//  INÍCIO CLASS.
public class Ex5_Tabuada 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args) 
    {
        //  INÍCIO EXERCÍCIO
            
            /*  EXERCÍCIO 4 TABUADA.
                Desenvolva um programa capaz de gerar uma tabuada de qualquer número
                inteiro entre 1 e 10. O usuário deve informar o número que deseja a tabuada.
                A saída deve resultar no exemplo abaixo:
                
                3 x 1 = 3
                3 x 2 = 6
                ...
                3 x 10 = 30
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner(System.in);
                int numeroDesejado;
                int contador = 0;
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.
                System.out.println("Digite o número a qual deseja a tabuada: ");
                numeroDesejado = scanner.nextInt();
                
                System.out.println("\nCALCULANDO TABUADA:");
                do
                {
                    System.out.println(numeroDesejado + " x " + contador + " = " + (numeroDesejado * contador));
                    contador++;
                }
                while (contador <= 10);
                System.out.println("PROGRAMA FINALIZADO!!\n");
            //  FIM SOLUÇÃO.

        //  FIM EXERCÍCIO.
    }
    //  FIM MÉTODO.
}
//  FIM CLASSE.