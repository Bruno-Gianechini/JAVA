public class Pessoa {

    //  ATRIBUTOS.
        private String nome;
        private int idade;
        private char sexo;

    //  MÉTODO CONSTRUTOR.
        Pessoa(){

        }

    //  MÉTODOS ACESSORES (SETTERS E GETTERS).
        public void setNome (String nome){
            this.nome = nome;
        }
        public String getNome (){
            return nome;
        }

        public void setIdade (int idade){
            this.idade = idade;
        }
        public int getIdade (){
            return idade;
        }

        public void setSexo (char sexo){
            this.sexo = sexo;
        }
        public char getSexo (){
            return sexo;
        }

    //  MÉTODOS
        private void fazerAniversario(){
        }
}
