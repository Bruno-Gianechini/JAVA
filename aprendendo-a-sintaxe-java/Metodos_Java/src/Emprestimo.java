//  INÍCIO CLASS.
public class Emprestimo 
{
    /*
        SIMULADOR EMPRÉSTIMO.
        Crie um programa que realiza o cálculo de um empréstimo levando em consideração
        o número de parcelas, a taxa e o valor solicitado e em seguida mostre o valor mensal
        a ser pago, havendo ou não juros em cada parcela.
    */
    
    //  INÍCIO MÉTODOS.
    public static void emprestimo(Double valorSolicitado, int parcelas, Double taxa)
    {
        switch (parcelas) 
        {
        
        //  VALORES SEM JUROS.
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("EMPRÉSTIMO SOLICITADO: " + valorSolicitado);
            System.out.println("Nº PARCELAS: " + parcelas);
            Double valorMensalSemJuros = (valorSolicitado / parcelas);
            System.out.println("VALOR A SER PAGO POR MÊS: " + valorMensalSemJuros);
            break;
        
        //  VALORES COM JUROS.
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            System.out.println("EMPRÉSTIMO SOLICITADO: " + valorSolicitado);
            System.out.println("Nº PARCELAS: " + parcelas);
            System.out.println("VALOR DA TAXA (%): " + taxa);
            valorMensalSemJuros = (valorSolicitado / parcelas);
            Double valorMensalComJuros = (valorMensalSemJuros + (valorMensalSemJuros*taxa));
            System.out.println("VALOR A SER PAGO POR MÊS: " + valorMensalComJuros);
            break;
        
        //  PARCELA INVÁLIDA.
            default:
            System.out.println("Por favor insira valores da parcela entre 1 e 12 e execute novamente.");
            break;
        }
    }
    //  FIM MÉTODOS.
}
//  FIM CLASSE.