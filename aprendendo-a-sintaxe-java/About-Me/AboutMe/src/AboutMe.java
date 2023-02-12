import javax.swing.plaf.synth.SynthSpinnerUI;

//  INÍCIO CLASSE
public class AboutMe 
    {
        public static void main(String[] args)
            {
                //  INÍCIO ATRIBUTOS
                    String nome = args [0];
                    String sobrenome = args [1];
                    int idade = Integer.valueOf(args[2]);
                    double altura = Double.valueOf(args[3]);
                //  FIM ATRIBUTOS

                //  INÍCIO SAÍDA
                    System.out.println("Olá, me chamo " + nome + " " + sobrenome);
                    System.out.println("Tenho " + idade + " anos");
                    System.out.println("E minha altura é de " + altura + " cm.");
                    System.out.println("Sejam muito bem vindos(as) ao meu humilde perfil!!");
                //  FIM SAÍDA
            }
    }
//  FIM CLASSE