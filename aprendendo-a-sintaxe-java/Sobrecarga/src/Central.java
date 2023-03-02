import javax.sql.rowset.spi.SyncResolver;

//  INÍCIO CLASSE.
public class Central 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args) 
    {
        System.out.println("\nCALCULADORA DE ÁREA DOS QUADRILÁTEROS NOTÁVEIS SEM RETORNO:\n");

        //  ÁREA QUADRADO.
            Quadrilateros_Notaveis.area(3.0);
        //  ÁREA RETÂNGULO.
            Quadrilateros_Notaveis.area(5.0,5.0);
        //  ÁREA TRAPÉZIO.
            Quadrilateros_Notaveis.area(7.0, 8.0, 9.0);
        //  ÁREA LOSANGO.
            Quadrilateros_Notaveis.area(3f, 1f);

        System.out.println("\nPROGRAMA FINALIZADO!!\n");
        

        System.out.println("\nCALCULADORA DE ÁREA DOS QUADRILÁTEROS NOTÁVEIS COM RETORNO:\n");

        //  ÁREA QUADRADO.
            Double areaQuadrado = Quadrilateros_Notaveis_Retorno.area(3d);
            System.out.println("AREA QUADRADO: " + areaQuadrado);

        //  ÁREA RETÂNGULO.
            Double areaRetangulo = Quadrilateros_Notaveis_Retorno.area(5d, 5d);
            System.out.println("ÁREA RETÂNGULO: " + areaRetangulo);

        //  ÁREA TRAPÉZIO.
            Double areaTrapezio = Quadrilateros_Notaveis_Retorno.area(7d, 8d, 9d);
            System.out.println("ÁREA TRAPÉZIO: " + areaTrapezio);

        //  ÁREA LOSANGO.
            float areaLosango = Quadrilateros_Notaveis_Retorno.area(3f,1f);
            System.out.println("ÁREA LOSANGO: " + areaLosango);

        System.out.println("\nPROGRAMA FINALIZADO!!\n");
    }
    //  FIM MÉTODO
}
//  FIM CLASSE.