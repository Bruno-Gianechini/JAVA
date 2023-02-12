import javax.swing.plaf.synth.SynthSpinnerUI;

//  INÍCIO CLASSE
public class AboutMe 
    {
        public static void main(String[] args)
            {
                //  INÍCIO ATRIBUTOS
                    String nome = args [0];
                    String sobrenome = args [1];
                    int idade = Integer.valueOf(args [2]);
                    double altura = Double.valueOf(args [3]);
                    String mensagem = args [4];
                //  FIM ATRIBUTOS

                //  INÍCIO SAÍDA
                    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
                    System.out.println("Tenho " + idade + " anos");
                    System.out.println("E minha altura é de " + altura + " cm.");
                    System.out.println(mensagem);
                //  FIM SAÍDA
            }
    }
//  FIM CLASSE