import java.util.Random;

//  INÍCIO CLASSE.
public class Ex9_AleatoriosESucessores 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args)
    {
        //  INÍCIO EXERCÍCIO.

            /*
                EXERCÍCIO 09 - ALEATÓRIOS E SUCESSORES.
                Crie um programa capaz de preencher um vetor de 20 posições
                com números aleatórios entre 0 e 100 e ao final mostre os números obtidos no vetor
                e em um outro vetor contendo seus sucessores.
            */

            //  INÍCIO VARIÁVEIS.
                Random random = new Random();
                int[] numerosVetor = new int[20];
                int[] sucessorVetor = new int [20];
                int numero;
                int contador = 0;
            //  FIM VARIÁVEIS.  

            //  INÍCIO SOLUÇÃO.
            
                //  INÍCIO ESTRUTURA DE REPETIÇÃO (DO WHILE).
                do
                {
                    numero = random.nextInt(100);
                    numerosVetor[contador] = numero;
                    sucessorVetor[contador] = numero+1;
                    contador ++;
                }
                while (contador < 20);
                //  FIM ESTRUTURA DE REPETIÇÃO (DO WHILE).

                //  INÍCIO SAÍDA DE DADOS.
                    System.out.println("\nRESULTADO DO VETOR:");
                    contador = 0;
                    
                    do
                    {
                        System.out.println("O valor na posição " + contador + " é: " + numerosVetor[contador] + " e seu sucessor é: " + sucessorVetor[contador]);
                        contador ++;
                    }
                    while (contador < 20);

                    System.out.println("PROGRAMA FINALIZADO!!\n\n");

                //  FIM SAÍDA DE DADOS.
        //  FIM EXERCÍCIO.
    }
    //  FIM MÉTODO.
}
//  FIM CLASSE.