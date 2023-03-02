import javax.sql.rowset.CachedRowSet;

//  INÍCIO CLASSE.
public class Mensagem 
{
    /*
        MENSAGEM DE BOAS VINDAS:
        Crie um programa que exiba uma mensagem de saudação (Bom dia, boa tarde, boa noite.)
        de acordo com o horário informado.
    */
    
    //  INÍCIO MÉTODOS.
        public static void hora (int hora)
        {
            switch (hora)
            {
                //  HORÁRIOS DA MANHÃ.
                    case 0: 
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11: 
                //  SAÍDA
                    System.out.println("BOM DIA!!");
                    break;

                //  HORÁRIOS DA TARDE.
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                //  SAÍDA.
                    System.out.println("BOA TARDE!!");
                    break;

                //  HORÁRIOS DA NOITE.
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                //  SAÍDA.
                    System.out.println("BOA NOITE!!");
                    break;

                //  SAÍDA HORA INVÁLIDA.
                    default:
                    System.out.println("Por gentileza insira um horário válido e execute novamente. \nOBRIGADO!!");
                    break;
            }
        }
    //  FIM MÉTODOS.

}
//  FIM CLASSE