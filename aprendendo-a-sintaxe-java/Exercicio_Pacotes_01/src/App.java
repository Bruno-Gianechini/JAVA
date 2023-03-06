import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;


public class App {
    public static void main(String[] args) {

    //  CLASSES DENTRO DO DIRETÓRIO VÍDEOS/.
        Anime anime = new Anime();
        Filme filme = new Filme();
        Documentario documentario = new Documentario();
        Novela novela = new Novela();
        Series serie = new Series();

    //  CLASSES DENTRO DO DIRETÓRIO GUI/.
        Janela janela01 = new Janela();
        MiniaturaVideo miniatura01 = new MiniaturaVideo();
    
    //  CLASSES DENTRO DO DIRETÓRIO GUI/BOTÕES/.
        BotaoPause botaoPause = new BotaoPause();
        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoVoltar botaoVoltar = new BotaoVoltar();


    
    }
}