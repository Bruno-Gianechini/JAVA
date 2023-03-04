public class Funcionario extends Pessoa {

    //  ATRIBUTOS ESPECÍFICOS.
        private String setor;
        private boolean trabalhando;

    //  MÉTODO CONSTRUTOR.
        Funcionario(){

        }

    //  MÉTODOS ACESSORES (SETTER E GETTERS).
        public void setSetor (String setor){
            this.setor = setor;
        }
        public String getSetor (){
            return setor;
        }

        public void setTrabalhando (boolean trabalhando){
            this.trabalhando = trabalhando;
        }
        public boolean getTrabalhando (){
            return trabalhando;
        }

    //  MÉTODOS ESPECÍFICOS.
        private void mudarTrabalho(){
            
        }
    
}
