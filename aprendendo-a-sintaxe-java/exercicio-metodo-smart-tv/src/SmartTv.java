//  INÍCIO CLASSE SMARTTV.
    public class SmartTv 
{
    //  INÍCIO ATRIBUTOS.
        boolean ligada = false;
        int canal = 1;
        int volume = 25;
    //  FIM ATRIBUTOS.

    //  INÍCIO MÉTODOS.

        //  INÍCIO LIGAR TV.
            public void ligar()
            {
                System.out.println("!! - Ligando a TV");
                ligada = true;
            }
        //  FIM LIGAR TV.
            
        //  INÍCIO DESLIGAR TV.
            public void desligar()
            {
                ligada = false;
                System.out.println("!! - Desligando a TV");
            }
        //  FIM DESLIGAR TV.
        
        //  INÍCIO AUMENTAR VOLUME.
            public void aumentarVolume()
            {   
                volume++;
                System.out.println("!! - Aumentando o volume: " + volume);
            }
        //  FIM AUMENTAR VOLUME.

        //  INÍCIO DIMINUIR VOLUME.
            public void diminuirVolume()
            {   
                volume--;
                System.out.println("!! - Diminuindo o volume: " + volume);
            }
        //  FIM DIMINUIR VOLUME.

        //  INÍCIO AUMENTAR CANAL.
            public void aumentarCanal()
            {   
                canal++;
                System.out.println("!! - Aumentando o canal: " + canal);
            }
        //  FIM AUMENTAR CANAL.

        //  ESCOLHER CANAL.
            public void escolherCanal(int novoCanal)
            {
                canal = novoCanal;
                System.out.println("!! - Canal mudado para: " + canal);
            }
        //  FIM ESCOLHER CANAL.

        //  INÍCIO DIMINUIR CANAL.
            public void diminuirCanal()
            {   
                System.out.println("!! - Diminuindo o canal: " + canal);
                canal--;
            }
        //  FIM DIMINUIR CANAL.

    //  FIM MÉTODOS.
}
//  FIM CLASSE SMARTTV.