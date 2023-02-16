import java.util.Random;

//  INÍCIO CLASSE.
public class Ex10_ArrayMultidimensional
{
    //  INÍCIO MÉTODO.
        public static void main(String[] args) 
        {
            //  INÍCIO EXERCÍCIO.
            
                /*
                    EXERCÍCIO 10 - ARRAY MULTIDIMENSIONAL.
                    Crie um programa capaz de gerar e imprimir
                    uma matrix (Multidimensional) 4x4 com valores aleatórios
                    entre 0 e 9.
                */

                //  INÍCIO VARIÁVEIS.
                    Random random = new Random();
                    int[][] matriz = new int[4][4];
                //  FIM VARIÁVEIS.

                //  INÍCIO SOLUÇÃO.
                    for(int i = 0; i < matriz.length; i ++)
                    {
                        for(int j=0; j < matriz[i].length; j++)
                        {
                            matriz[i][j] = random.nextInt(9);
                        }
                    }                 
                //  FIM SOLUÇÃO.

                //  INÍCIO SAÍDA DE DADOS.
                    System.out.println("\nMATRIZ: ");
                    for(int[] linha : matriz)
                    {
                        for (int coluna : linha)
                        {
                            System.out.println(coluna + " ");
                        }
                        System.out.println();
                    }
            //  FIM EXERCÍCIO.
        }
    //  FIM MÉTODO.
}
//  FIM CLASSE.