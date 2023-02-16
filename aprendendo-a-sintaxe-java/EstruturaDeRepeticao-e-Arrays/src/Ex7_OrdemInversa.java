//  INÍCIO CLASSE.
public class Ex7_OrdemInversa 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args) 
    {
        //  INÍCIO EXERCÍCIO.
            
            /*
                EXERCÍCIO 07 = ORDEM INVERSA DE UM VETOR.
                Crie um programa que leia um vetor de 6 números
                inteiros e em seguida mostre os valores contidos
                na ordem inversa.            
            */

            //  INÍCIO VARIÁVEIS.
                int[] vetor = {3, -2, 6, -4, 5, 1};                     // Atribui o tipo de dado possível no vetor e determina o valor em suas posições.
                int contador = vetor.length-1;                          // Define o valor inicial do contador.
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.
                System.out.println("\nINÍCIO DO PROGRAMA: ");
                System.out.println("O comprimento do vetor é: " + vetor.length);
                System.out.println("\nOs números contidos em ordem inversa são: ");

                //  INÍCIO ESTRUTURA DE REPETIÇÃO.
                do                                                             // Inicia o bloco de repetição através da estrutura do-while.
                {
                    System.out.println("Valor posição " + contador + " é : " + vetor[contador]);
                    contador--;                                                // Reduz o contador em 1.
                }
                while (contador >= 0);                                         // Condiciona a repetição até que o contador seja 0.
                //  FIM ESTRUTURA DE REPETIÇÃO.

                System.out.println("PROGRAMA FINALIZADO!! \n");             // Exibe a mensagem de fim do programa.
            
            //  FIM SOLUÇÃO.

        //  FIM EXERCÍCIO.
    }   
    //  FIM MÉTODO.
}
//  FIM CLASSE.