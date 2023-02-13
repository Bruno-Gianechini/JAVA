//  INÍCIO CLASSE.
    public class OperadoresLogicos 

{
    public static void main(String[] args)
        {
            //  INÍCIO VARIÁVEIS.
                boolean bV1 = true;
                boolean bV2 = true;
                boolean bF1 = false;
                boolean bF2 = false;
            //  FIM VARIÁVEIS.

            //  INÍCIO RESULTADOS.

                //  INÍCIO CONJUNÇÃO (E/AND - &&).
                    System.out.println("\nCONJUNÇÃO (E/AND - &&):");
                    System.out.println("Ambos falsos = " + (bF1 && bF2));
                    System.out.println("Falso e Verdadeiro = " + (bF1 && bV1));
                    System.out.println("Verdadeiro e Falso = " + (bV1 && bF1));
                    System.out.println("Ambos verdadeiros = " + (bV1 && bV2));
                //  FIM CONJUNÇÃO.

                //  INÍCIO DISJUNÇÃO (OU/OR - ||).
                    System.out.println("\nDISJUNÇÃO (OU/OR - ||):");
                    System.out.println("Ambos falsos = " + (bF1 || bF2));
                    System.out.println("Falso e Verdadeiro = " + (bF1 || bV1));
                    System.out.println("Verdadeiro e Falso = " + (bV1 || bF1));
                    System.out.println("Ambos verdadeiros = " + (bV1 || bV2));
                //  FIM DISJUNÇÃO
            
                //  INÍCIO DISJUNÇÃO EXCLUSIVA (OU EXCLUSIVO/XOR - ^).
                    System.out.println("\nDISJUNÇÃO EXCLUSIVA (OU EXCLUSIVO/XOR - ^):");
                    System.out.println("Ambos falsos = " + (bF1 ^ bF2));
                    System.out.println("Falso e Verdadeiro = " + (bF1 ^ bV1));
                    System.out.println("Verdadeiro e Falso = " + (bV1 ^ bF1));
                    System.out.println("Ambos verdadeiros = " + (bV1 ^ bV2));
                //  FIM DISJUNÇÃO EXCLUSIVA.

                //  INÍCIO INVERSOR (INVERSÃO/NOT - !).
                    System.out.println("\nINVERSOR (NOT - !):");
                    System.out.println("Ambos falsos = " + !(bF1 ^ !bF2));
                    System.out.println("Falso e Verdadeiro = " + !(bF1 ^ bV1));
                    System.out.println("Verdadeiro e Falso = " + !(bV1 ^ bF1));
                    System.out.println("Ambos verdadeiros = " + !(bV1 ^ bV2));
                //  FIM DISJUNÇÃO EXCLUSIVA.                
            
            //  FIM RESULTADOS.
        }
    
}

//  FIM CLASSE.
