public class Aluno extends Pessoa {
    
    //  ATRIBUTOS ESPECÍFICOS.
        private boolean matricula;
        private String curso;

    //  MÉTODO CONSTRUTOR.
        Aluno(){

        }

    //  MÉTODOS ACESSORES (SETTERS E GETTERS).
        public void setMatricula (boolean matricula){
            this.matricula = matricula;
        }
        public boolean getMatricula(){
            return matricula;
        }

        public void setCurso (String curso){
            this.curso = curso;
        }
        public String getCurso (){
            return curso;
        }

    //  MÉTODOS ESPECÍFICOS.
        public void cancelarMatricula(){
            System.out.println("Matricula será cancelada!!");
        }

        
}
