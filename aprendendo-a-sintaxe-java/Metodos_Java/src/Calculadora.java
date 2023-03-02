import java.util.Scanner;

//  INÍCIO CLASSE.
public class Calculadora
{   
    
    /*
        EXERCÍCIO CALCULADORA. 
        Crie um programa capaz de receber dois valores inteiros.
        e então realizar uma das quatro operações matemáticas conforme desejado.
    */

    //  INÍCIO MÉTODOS.
        
        //  SOMAR.
            public static void somar(float x, float y)
            {
                float resultado = (x+y);
                System.out.println("RESULTADO SOMA:");
                System.out.println(x + "+" + y + " é igual a: " + resultado);
            }

        //  SUBTRAIR.
            public static void subtrair(float x, float y)
            {
                float resultado = (x-y);
                System.out.println("\nRESULTADO SUBTRAÇÃO:");
                System.out.println(x + "-" + y + " é igual a: " + resultado);
            }

        //  MULTIPLICAR.
            public static void multiplicar(Double x, Double y)
            {
                Double resultado = (x*y);
                System.out.println("\nRESULTADO MULTIPLICAÇÃO:");
                System.out.println(x + "x" + y + " é igual a: " + resultado);
            }

        //  DIVIDIR.
            public static void dividir(Double x, Double y)
            {
                Double resultado = (x/y);
                System.out.println("\nRESULTADO DIVISÃO:");
                System.out.println(x + "/" + y + " é igual a: " + resultado);
                System.out.println("\nPROGRAMA CÁLCULO FINALIZADO!! \n");
            }

    //  FIM MÉTODOS.

}
//  FIM CLASSE.
