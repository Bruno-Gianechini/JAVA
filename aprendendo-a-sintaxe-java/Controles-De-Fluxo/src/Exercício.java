import java.text.BreakIterator;
import java.util.Scanner;

//  INÍCIO CLASSE.
    public class Exercício
{
    public static void main(String[] args) 
        {
            //  INÍCIO EXERCÍCIO.

                /*  
                    ENUNCIADO:
                    Com switch use String para a partir do dia da semana, exibir seu número
                    ainda no switch, faça outro exemplo onde, se uma variável inteira for 
                    entre 1 e 3 exibir o texto "Certo". Se for 4 exibir "Errado", se for 5
                    "Talvez" e para os demais valores exibir "Valor indefinido".
                 */

                //  INÍCIO SOLUÇÃO.
                
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Por favor digite o nome do dia desejado: ");
                    String dia = scanner.next();

                    switch (dia) 
                    {
                        case "Segunda":
                            System.out.println(2);
                            break;
                        case "Terca":                            
                        System.out.println(3);
                            break;
                        case "Quarta":
                            System.out.println(4);
                            break;
                        case "Quinta":
                            System.out.println(5);
                            break;
                        case "Sexta":
                            System.out.println(6);
                            break;
                        case "Sabado":
                            System.out.println(7);
                            break;
                        case "Domingo":
                            System.out.println(1);
                            break;

                    }
 
                //  FIM SOLUÇÃO.

            //  FIM EXERCÍCIO.
        }
}
//  FIM CLASSE.