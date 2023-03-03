//  INÍCIO CLASSE
public class Central 
{
    //  MÉTODO.
    public static void main(String[] args) 
    {
    //  PARÂMETROS CANETA.
        Caneta canetaAzul_5mm = new Caneta("Crown.","Azul.",1d);

    //  PARÂMETROS CARRO.
        Carro fox = new Carro("Cross 1.6 Highline.","Azul.",32);
    /*  
        fox.setModeloCarro("Fox 1.6 Highline");
        fox.setCorCarro("Preto");
        fox.setCapacidadeTanque(30);
    */

    //  SAÍDA.
        canetaAzul_5mm.status();
        fox.info();
    }
}
//  FIM CLASSE