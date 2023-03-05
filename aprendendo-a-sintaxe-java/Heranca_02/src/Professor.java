public class Professor extends Pessoa {
    
    //  ATRIBUTOS ESPECÍFICOS.
        private String especialidade;
        private double salario;
        private double aumento;

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

        public void setSalario (double salario){
            this.salario = salario;
        }
        public double getSalario (){
            return salario;
        }


    //  MÉTODOS ESPECÍFICOS.
        public void receberAumento(double aumento){
            System.out.println("Novo salário: " + ( getSalario() + aumento ) );            
        }
}
