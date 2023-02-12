import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

//  INÍCIO CLASSE.
public class AboutMe 
    {
        public static void main(String[] args)
            {
                //  INÍCIO ATRIBUTOS.
                    String nome = args [0];
                    String sobrenome = args [1];
                    int idade = Integer.valueOf(args [2]);
                    double altura = Double.valueOf(args [3]);
                    String mensagem = args [4];
                //  FIM ATRIBUTOS.
                
                //  INÍCIO SCANNER.
                    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
                //  FIM SCANNER.

                //  INÍCIO ENTRADA.

                    //  INÍCIO NOME.
                        System.out.println("Por favor, digite seu nome: ");
                        nome = scanner.next();
                    //  FIM NOME.

                    //  INÍCIO SOBRENOME.
                        System.out.println("Qual seu sobrenome? ");
                        sobrenome = scanner.next();
                    //  FIM SOBRENOME.

                    //  INÍCIO IDADE.
                        System.out.println("Nos diga sua idade: ");
                        idade = scanner.nextInt();
                    //  FIM IDADE.

                    //  INÍCIO ALTURA.
                        System.out.println("Sua altura é? ");
                        altura = scanner.nextDouble();
                    //  FIM ALTURA.

                    //  INÍCIO MENSAGEM.
                        System.out.println("Quer dizer alguma coisa ou deixar uma mensagem? ");
                        mensagem = scanner.next();
                    //  FIM MENSAGEM.
                
                //  FIM ENTRADA.

                //  INÍCIO SAÍDA.
                    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
                    System.out.println("Tenho " + idade + " anos");
                    System.out.println("E minha altura é de " + altura + " cm.");
                    System.out.println(mensagem);
                //  FIM SAÍDA.
            }
    }
//  FIM CLASSE.