import java.util.Scanner;

//  INÍCIO CLASSE.
public class Ex1_NomeEIdade
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args) 
        {
        //  INÍCIO EXERCÍCIOS.
            /*
                EXERCÍCIO 1
                Faça um programa que leia conjuntos de dois valores,
                o primeiro representando o nome do aluno e o segundo representando a sua idade.
                (Pare o programa inserindo o valor 0 no campo nome)
            */

            //  INÍCIO VARIÁVEIS.
                Scanner scanner = new Scanner(System.in);
                String nome = "_";
                int idade;
            //  FIM VARIÁVEIS.
                
                //  INÍCIO CONTROLE DE FLUXO (WHILE).
                    while (true) 
                    {
                        System.out.println("\nINFORMAÇÕES DE ALUNO(A): ");
                        System.out.println("Nome do aluno: ");
                        nome = scanner.next();
                        if (nome.equals("0")) break;

                        System.out.println("Idade do aluno: ");
                        idade = scanner.nextInt();
                    }
                //  FIM CONTROLE DE FLUXO (WHILE).
                System.out.println("Programa finalizado!!");
        }
    //  FIM MÉTODO.

}
//  FIM CLASSE