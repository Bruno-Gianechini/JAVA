public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // METODOS

        // LIGAR TV.
        public void ligar()
            {
                System.out.println("!! - Ligando a TV");
                ligada = true;
            }
            
        // DESLIGAR TV.
        public void desligar()
            {
                ligada = false;
                System.out.println("!! - Desligando a TV");
            }
        
        // AUMENTAR VOLUME.
        public void aumentarVolume()
            {   
                volume++;
                System.out.println("!! - Aumentando o volume: " + volume);
            }
    
        // DIMINUIR VOLUME.
        public void diminuirVolume()
            {   
                volume--;
                System.out.println("!! - Diminuindo o volume: " + volume);
            }
        
        // AUMENTAR CANAL.
        public void aumentarCanal()
            {   
                canal++;
                System.out.println("!! - Aumentando o canal: " + canal);
            }

        // ESCOLHER CANAL.
        public void escolherCanal(int novoCanal)
            {
                canal = novoCanal;
                System.out.println("!! - Canal mudado para: " + canal);
            }
    
        // DIMINUIR CANAL.
        public void diminuirCanal()
            {   
                System.out.println("!! - Diminuindo o canal: " + canal);
                canal--;
            }
}