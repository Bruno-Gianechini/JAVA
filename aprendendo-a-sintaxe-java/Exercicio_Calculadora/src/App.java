import java.util.Scanner;

import arquivos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);
        double numero01 = 0;
        double numero02 = 0;



        System.out.println("\nDigite o primeiro número: ");
        numero01 = scanner.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        numero02 = scanner.nextDouble();

        System.out.println("\nRESULTADOS: ");
        System.out.println(Calculo.somar(numero01, numero02));
        System.out.println(Calculo.subtrair(numero01, numero02));
        System.out.println(Calculo.multiplicar(numero01, numero02));
        System.out.println(Calculo.dividir(numero01, numero02));
        System.out.println("FIM DO PROGRAMA!!\n");
    }
}