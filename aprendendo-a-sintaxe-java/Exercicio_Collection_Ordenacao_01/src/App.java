import java.util.ArrayList;
import java.util.List;

/* Dadas as seguintes informações sobre gatos, crie uma lista
    e ordene esta Lista exibindo: 
    (nome - idade (meses) - cor).

    Gato 1:
        Nome: Jon
        Idade: 18
        Cor: Preto

    Gato 2
        Nome: Simba
        Idade : 6
        Cor: Tigrado
    
    Gato 3
        Nome: Jon
        Idade : 12
        Cor: Amarelo
    
     */
public class Ordenacao {
    public static void main(String[] args) {
        
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato(nome: "Jon", idade: 18, cor: "Preto"));
            add(new Gato (nome: "Simba", idade: 12, cor: "Tigrado"));
            add(new Gato (nome: "Jon", idade: 6, cor: "Amarelo"));
        }};
    }
}
public class App {
    public static void main(String[] args) {

        Class Gato{
            private String nome;
            private Integer idade;
            private String cor;

        public Gato ( String nome, Integer idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public String toString() {
            return "App [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
        }

        
    }

}