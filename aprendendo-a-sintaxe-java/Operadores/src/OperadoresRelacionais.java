//  INÍCIO CLASSE.
    public class OperadoresRelacionais

{

    public static void main(String[] args)

        {    

            //  INÍCIO COMPARAÇÕES.
                    
                //  INÍCIO VARIÁVAIS INTEIROS.
                    int inteiro1 = 1;
                    int inteiro2 = 2;
                //  FIM VARIÁVEIS INTEIROS.

                //  INÍCIO COMPARAÇÕES INTEIROS.
                    System.out.println("1 é igual a 2? " + (inteiro1 == inteiro2));
                    System.out.println("1 é diferente de 2? " + (inteiro1 != inteiro2));
                    System.out.println("1 é maior que 2? " + (inteiro1 > inteiro2));
                    System.out.println("1 é menor que 2? " + (inteiro1 < inteiro2));
                    System.out.println("1 é maior ou igual a 2? " + (inteiro1 >= inteiro2));
                    System.out.println("1 é menor ou igual a 2? " + (inteiro1 <= inteiro2));
                //  FIM COMPARAÇÕES INTEIROS.

/*-----------------------------------------------------------------------------------------------*/

                //  INÍCIO VARIÁVEIS FLUTUANTES.
                    float flutuante15 = 1.5f;
                    float flutuante20 = 2.0f;
                //  FIM VARIÁVEIS FLUANTES

                //  INÍCIO COMPARAÇÕES FLUTUANTES.
                    System.out.println("1.5 é igual a 2.0? " + (flutuante15 == flutuante20));
                    System.out.println("1.5 é diferente de 2.0? " + (flutuante15 != flutuante20));
                    System.out.println("1.5 é maior que 2.0? " + (flutuante15 > flutuante20));
                    System.out.println("1.5 é menor que 2.0? " + (flutuante15 < flutuante20));
                    System.out.println("1.5 é maior ou igual a 2.0? " + (flutuante15 >= flutuante20));
                    System.out.println("1.5 é menor ou igual a 2.0? " + (flutuante15 <= flutuante20));
                //  FIM COMPARAÇÕES FLUTUANTES.

/*-----------------------------------------------------------------------------------------------*/

                //  INÍCIO VARIÁVEIS CARACTERES.
                    char caractereX = 'X';
                    char caractereY = 'Y';
                //  FIM VARIÁVEIS CARACTERES.

                //  INÍCIO COMPARAÇÕES CARACTERES.
                    System.out.println("X é igual a Y? " + (caractereX == caractereY));
                    System.out.println("X é diferente de Y? " + (caractereX != caractereY));
                    System.out.println("X é maior que Y? " + (caractereX > caractereY));
                    System.out.println("X é menor que Y? " + (caractereX < caractereY));
                    System.out.println("X é maior ou igual a Y? " + (caractereX >= caractereY));
                    System.out.println("X é menor ou igual a Y? " + (caractereX <= caractereY));
                //  FIM COMPARAÇÕES CARACTERES.

/*-----------------------------------------------------------------------------------------------*/
                //  INÍCIOS VARIÁVEIS STRING.
                    String palavra1 = "Carro";
                    String palavra2 = "Moto";
                    String palavra3 = "Moto";
                //  FIM VARIÁVEIS STRING.

                //  INÍCIO COMPARAÇÕES STRING.
                    System.out.println("A palavra 2 é igual a palavra 3? " + (palavra2 == palavra3));
                    System.out.println("A palavra 1 é diferente da palavra 2? " + (palavra1 != palavra2));
                //  FIM COMPARAÇÕES STRING.

/*-----------------------------------------------------------------------------------------------*/

                //  INÍCIO OUTRAS VARIÁVEIS .
                    double double5960 = 59.60d;
                    boolean booleanoVerdadeiro = true;
                    boolean booleanoFalso = false;
                    byte byte1 = 1;
                    short short25 = 25;
                    long long1597 = 1597L;
                    long long2997 = 2997L; 
                //  FIM OUTRAS VARIÁVEIS.
                
                //  INÍCIO COMPARAÇÕES CARACTERES.
                    System.out.println("Verdadeiro é igual a verdadeiro? " + (booleanoVerdadeiro == booleanoVerdadeiro));
                    System.out.println("Verdadeiro é diferente de falso? " + (booleanoVerdadeiro != booleanoFalso));
                    System.out.println("59,60 é maior que 1? " + (double5960 > byte1));
                    System.out.println("25 é menor que 59,60? " + (short25 < double5960));
                    System.out.println("1.597 é maior ou igual a 2.997? " +(long1597 >= long2997));
                    System.out.println("1.597 é menor ou igual a 2.997? " + (long1597 <= long2997));
                //  FIM COMPARAÇÕES CARACTERES.

            //  FIM COMPARAÇÕES.

        }

}

//  FIM CLASSE.