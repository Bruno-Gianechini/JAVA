//  INÍCIO CLASSE.
public class Quadrilateros_Notaveis_Retorno 
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
            public static Double area (Double l) 
            {       
                return l*l;
            }    
    
        //  ÁREA RETÂNGULO.
            public static Double area (Double b, Double h)
            {
                return (b*h);
            }
        
        //  ÁREA TRAPÉZIO.
            public static Double area (Double b, Double B, Double h)
            {
                return (((B + b) * h)/2);
            }

        //  ÁREA LOSANGO.
            public static float area (Float D, float d)
            {
                return ((D * d) /2);
            }

    //  FIM MÉTODOS.
}
//  FIM CLASSE.

