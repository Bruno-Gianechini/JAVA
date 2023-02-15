import java.util.Scanner;

//  INÍCIO CLASSE.
public class Ex6_Fatorial 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args)
    {
        //  INÍCIO EXERCÍCIO.

            /*  
                EXERCÍCIO 6 - FATORIAL.
                 Faça um programa que calcule o valor resultante de um número fatorial.
                 Exemplo: 4! = 4 * 3 * 3 * 1 = 24.
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner(System.in);           //  Aguarda a inserção de um dado por um usuário.
                int numeroDesejado;
                int contador;
                int resultado;
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.

                //  INÍCIO ENTRADA DE DADOS.
                    System.out.println("\nDigite o número e descubra o resultado de seu fatorial: ");

                    numeroDesejado = scanner.nextInt();             //  Recebe o valor inserido pelo usuário.
                    resultado = numeroDesejado;                     //  Recebe o valor inserido pelo usuário.
                    contador = numeroDesejado-1;                    //  Salva o primeiro número a multiplicar e serve como contagem para fatoração.
                //  FIM ENTRADA DE DADOS.

                    //  INÍCIO DA REPETIÇÃO.
                        do
                        {
                           resultado = (resultado*contador);        //  Recebe o resultado da multiplicação entre o resultado e o contador.
                           contador --;                             //  Diminui o contador em 1 para que a próxima multiplicação com o resultado mantenha a continuidade do cálculo fatorial.
                        }
                        while(contador != 1);                       //  Realiza a repetição do bloco até que o resultado do contador se torne 1.
                    //  FIM DA REPETIÇÃO.

                //  INÍCIO SAÍDA DE DADOS.
                    System.out.println("\nRESULTADO:");
                    System.out.println(numeroDesejado + "! é igual a: " + resultado);
                    System.out.println("PROGRAMA FINALIZADO!!\n");
                //  FIM SAÍDA DE DADOS.

            //  FIM SOLUÇÃO.

        //  FIM EXERCÍCIO.
    }  
}
//  FIM CLASSE.