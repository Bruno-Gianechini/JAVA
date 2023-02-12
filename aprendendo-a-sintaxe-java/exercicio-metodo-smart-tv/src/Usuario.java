//  INÍCIO CLASSE USUÁRIO.
    public class Usuario 
{
    public static void main(String[] args) throws Exception 
    {
        SmartTv smartTv = new SmartTv();

        //  INÍCIO ESTADO INICIAL DA TV.
            System.out.println("TV Ligada: " + smartTv.ligada);
            System.out.println("Canal atual: " + smartTv.canal);
            System.out.println("Volume atual: " + smartTv.volume);
        //  FIM ESTADO INICIAL DA TV.

        //  INÍCIO INTERAÇÕES DO USUÁRIO.
            smartTv.ligar();
            System.out.println("TV Ligada: " + smartTv.ligada);
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.diminuirVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarCanal();
            smartTv.aumentarCanal();
            smartTv.escolherCanal(13);
        //  FIM INTERAÇÕES DO USUÁRIO.
    }
}
//  FIM CLASSE USUÁRIO.