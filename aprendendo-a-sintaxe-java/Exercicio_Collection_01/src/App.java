import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {


    public static void main(String[] args) throws Exception {

        /*
            Crie uma lista com 7 notas:
            (7, 8.5, 9.3, 5, 7, 0, 3.6)
            * usar tipo Double.
        */
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        //  EXIBA A LISTA
            System.out.println("\nLista inicial: ");
            System.out.println(notas.toString());
            
        //  EXIBA A POSIÇÃO DA NOTA 5. (obs: a posição inicial é 0).
            System.out.println("\nExiba a posição da nota 5: ");
            System.out.println(notas.indexOf(5d));
            
        //  ADICIONE NA LISTA A NOTA 8 NA POSIÇÃO 4.
            System.out.println("\nAdicione a nota 8 na posição 4: ");
            notas.add(4, 8d);
            System.out.println(notas.toString());

        //  SUBSTITUA A NOTA 5 PELA NOTA 6.
            System.out.println("\nSubstitua a nota 5 pela nota 6: ");
            notas.set(notas.indexOf(5d), 6d);
            System.out.println(notas.toString());

        //  CONFIRA SE A NOTA 5 ESTÁ NA LISTA.
            System.out.println("\nNota 5 consta na lista? " + notas.contains(5d));
        
        //  EXIBA TODAS AS NOTAS NA ORDEM QUE FORAM LANÇADAS.
/*            System.out.println("Exiba todas as notas em ordem (uma abaixo da outra)");
            for (Double nota : notas) System.out.println(nota); */

        //  EXIBA A TERCEIRA NOTA ADICIONADA.
            System.out.println("\nLista: ");
            System.out.println(notas.toString());
            System.out.println("\nQual a nota da posição 2? " + notas.get(2));

        //  EXIBA A MELHOR NOTA.
            System.out.println("\nQual a menor nota? " + Collections.min(notas));
        
        //  EXIBA A MAIOR NOTA.
            System.out.println("\nQual a maior nota? " + Collections.max(notas));
        
        //  EXIBA A SOMA DOS VALORES.
            Iterator<Double> iterator = notas.iterator();
            double soma = 0d;

            while(iterator.hasNext()){
                double next = iterator.next();
                soma = soma + next;
            }
            System.out.println("\nQual a soma dos valores? " + soma);

        //  EXIBA A MÉDIA DOS VALORES.
            System.out.println("\nA média é igual a: " + (soma/notas.size()));

        //  REMOVA A NOTA 0.
            notas.remove(0d);
            System.out.println(notas.toString());

        //  REMOVA A NOTA NA POSIÇÃO 0. 
            notas.remove(0);
            System.out.println(notas.toString());

        //  REMOVA AS NOTAS MENORES QUE 7 E EXIBA A LISTA.
            Iterator<Double> iterator2 = notas.iterator();
            while(iterator2.hasNext()){
                double next = iterator2.next();
                if (next < 7) iterator2.remove();
            System.out.println(notas.toString());
            }

        //  APAGUE TODA A LISTA.
            notas.clear();
            System.out.println("\nA tabela está vazia: " + notas.isEmpty());
          
    }
}
