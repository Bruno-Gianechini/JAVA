public class Professor extends Pessoa {
    
    //  ATRIBUTOS ESPECÍFICOS.
        private String especialidade;
        private boolean trabalhando;

    //  MÉTODO CONSTRUTOR.
        Professor(){

        }

    //  MÉTODOS ACESSORES (SETTERS E GETTERS).
        public void setEspecialidade (String especialidade){
            this.especialidade = especialidade;
        }
        public String getEspecialidade (){
            return especialidade;
        }

        public void setTrabalhando (boolean trabalhando){
            this.trabalhando = trabalhando;
        }
        public boolean getTrabalhando (){
            return trabalhando;
        }

    //  MÉTODOS ESPECÍFICOS.
        private void receberAumento(){

        }
}
