/*
DESAFIO: No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.

ENTRADA: A entrada será o tamanho da fila que aguardava para ver o show.

SAÍDA: A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas).

EXEMPLO:

    ENTRADA: 100
    SAÍDA: "50 pessoas no camarote"

    ENTRADA: 40
    SAÍDA: "20 pessoas no camarote"

    ENTRADA: 25
    SAÍDA: "13 pessoas no camarote"

    ENTRADA: 23
    SAÍDA: "12 pessoas no camarote"

*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha. 

import java.util.Scanner; 
    
public class CamaroteBlueCold {
    public static void main(String[] args) {
        // Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = 25;
        int pessoasNoCamarote = 0;
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        if ((tamanhoDaFila%2)==1)
        {
            pessoasNoCamarote = ((tamanhoDaFila/2)+1);
        }
        else
        {
        pessoasNoCamarote = (tamanhoDaFila/2);
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}