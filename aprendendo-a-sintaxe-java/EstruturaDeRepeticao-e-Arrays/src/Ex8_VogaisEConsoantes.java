import java.util.Scanner;

//  INÍCIO CLASSE.
public class Ex8_VogaisEConsoantes 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args)
    {
        //  INÍCIO EXERCÍCIO.

            /*
                EXERCÍCIO 08 - VOGAIS E CONSOANTES.
                Crie um programa capaz de incluir 6 letras inseridas pelo usuário
                em um vetor, e em seguida retorne quantas vogais e consoantes o vetor possui. 
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner (System.in);
                String[] vetor = new String [6];
                String letra;
                int contador = 0;
                int vogais = 0;
                int consoantes = 0;
            //  FIM VARIÁVEIS.

            //  INÍCIO SOLUÇÃO.

                //  INÍCIO ESTRUTURA DE REPETIÇÃO (DO WHILE).
                do
                {
                    System.out.println("Digite a letra para a posição " + contador + " do vetor.");
                    letra = scanner.next();                     // Aguarda à variável letra a letra inserida pelo usuário.
                    vetor[contador] = letra;                    // Atribui a letra digitada à posição do vetor correspondente ao contador

                    // Verifica se a letra inserida faz parte do grupo de vogais ou consoantes.
                    if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))
                    
                    {
                        vogais++;                               // Adiciona 1 ao contador de vogais.
                    }
                    else
                    {
                        consoantes++;                           // Adiciona 1 ao contador de consoantes.
                    }
                    contador++;                                 // Adiciona um ao contador.
                }
                while (contador <= vetor.length-1);             // Condiciona a repetição até que o número do contador seja igual ao comprimento do vetor.
                //  FIM ESTRUTURA DE REPETIÇÃO (DO WHILE).
                
                //  INÍCIO SAÍDA DE RESULTADOS.
                System.out.println("\n\nRESULTADO:");
                System.out.println("Vetor possui " + vogais + " vogais.");
                System.out.println("Vetor possui " + consoantes + " consoantes.");
                System.out.println("PROGRAMA FINALIZADO!!\n\n");
                //  FIM SAÍDA DE RESULTADOS.

            //  FIM SOLUÇÃO.

        //  FIM EXERCÍCIO.
    }

    //  FIM MÉTODO.
}
//  FIM CLASSE.