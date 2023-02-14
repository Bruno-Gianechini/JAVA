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
                    int valor;

                    switch (dia) 
                    {
                        case "Segunda":
                            valor = 2;
                            System.out.println("Valor: " + valor);
                            System.out.println("Certo");
                            break;
                        case "Terca":
                            valor = 3;
                            System.out.println("Valor: " + valor);
                            System.out.println("Certo");
                            break;
                        case "Quarta":
                            valor = 4;
                            System.out.println("Valor: " + valor);
                            System.out.println("Errado");
                            break;
                        case "Quinta":
                            valor = 5;
                            System.out.println("Valor: " + valor);
                            System.out.println("Talvez");
                            break;
                        case "Sexta":
                            valor = 6;
                            System.out.println("Valor: " + valor);
                            System.out.println("Valor indefinido!!");
                            break;
                        case "Sabado":
                            valor = 7;
                            System.out.println("Valor: " + valor);
                            System.out.println("Valor indefinido!!");
                            break;
                        case "Domingo":
                            valor = 1;
                            System.out.println("Valor: " + valor);
                            System.out.println("Certo");
                            break;
                    }

                //  FIM SOLUÇÃO.

            //  FIM EXERCÍCIO.
        }
}
//  FIM CLASSE.