//  INÍCIO CLASSE.
public class Quadrilateros_Notaveis 
{
    /*
        QUADRILÁTEROS NOTÁVEIS.
        Crie um programa que utilize métodos e sobrecarga
        para calcular a área dos quadriláteros notáveis.
        (Quadrado, retângulo, trapézio e losango).

        FÓRMULAS DAS ÁREAS:
        QUADRADO: lado².
        RETÂNGULO: base * Altura.
        TRAPÉZIO: ((BaseMaior + baseMenor) * Altura)/2.
        LOSANGO: (DiagonalMaior * diagonalMenor) / 2.
    */
    //  INÍCIO MÉTODO.
    
        //  ÁREA QUADRADO.
            public static void area (Double l) 
            {       
                Double areaQuadrado = (l*l);
                System.out.println("ÁREA DO QUADRADO: " + areaQuadrado);
            }    
    
        //  ÁREA RETÂNGULO.
            public static void area (Double b, Double h)
            {
                Double areaRetangulo = (b*h);
                System.out.println("ÁREA DO RETÂNGULO: " + areaRetangulo);
            }
        
        //  ÁREA TRAPÉZIO.
            public static void area (Double b, Double B, Double h)
            {
                Double areaTrapezio = (((B + b) * h)/2);
                System.out.println("ÁREA DO TRAPÉZIO: " + areaTrapezio);
            }

        //  ÁREA LOSANGO.
            public static void area (Float D, float d)
            {
                float areaTrapezio = ((D * d) /2);
                System.out.println("ÁREA DO TRAPÉZIO: " + areaTrapezio);
            }

    //  FIM MÉTODOS.
}
//  FIM CLASSE.

