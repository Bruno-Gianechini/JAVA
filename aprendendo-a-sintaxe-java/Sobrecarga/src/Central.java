import javax.sql.rowset.spi.SyncResolver;

//  INÍCIO CLASSE.
public class Central 
{
    //  INÍCIO MÉTODO.
    public static void main(String[] args) 
    {
        System.out.println("\nCALCULADORA DE ÁREA DOS QUADRILÁTEROS NOTÁVEIS:\n");
        //  ÁREA QUADRADO.
            Quadrilateros_Notaveis.area(3.0);

        //  ÁREA RETÂNGULO.
            Quadrilateros_Notaveis.area(5.0,5.0);

        //  ÁREA TRAPÉZIO.
            Quadrilateros_Notaveis.area(7.0, 8.0, 9.0);
    
        //  ÁREA LOSANGO.
            Quadrilateros_Notaveis.area(3f, 1f);

        System.out.println("\nPROGRAMA FINALIZADO!!\n");
    }
    //  FIM MÉTODO
}
//  FIM CLASSE.