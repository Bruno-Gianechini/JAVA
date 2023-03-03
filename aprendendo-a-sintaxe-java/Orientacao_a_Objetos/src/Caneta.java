//  INÍCIO CLASSE
public class Caneta
{
    //  ATRIBUTOS.
        private String modeloCaneta;
        private String corCaneta;
        private boolean tampada;
        private Double pontaCaneta;
        
    //  CONSTRUTOR.
        Caneta (String modelo, String cor, double ponta)
        {
            setModeloCaneta(modelo);
            setCorCaneta (cor);
            setPontaCaneta (ponta);
            tampar();
        }

    //  MÉTODOS (GETTERS E SETTERS).
        public void setModeloCaneta (String modelo){
            this.modeloCaneta = modelo;   
        }
        public String getModeloCaneta () {
            return this.modeloCaneta;
        }

        public void setCorCaneta (String cor){
            this.corCaneta = cor;
        }
        public String getCorCaneta (){
            return this.corCaneta;
        }

        public void setTampada (boolean tampada){
            this.tampada = tampada;
        }
        public boolean getTampada (){
            return tampada;
        }

        public void setPontaCaneta (Double ponta){
            this.pontaCaneta = ponta;
        }
        public Double getPontaCaneta(){
            return this.pontaCaneta;
        }

    //  MÉTODOS.

        public void tampar (){
            this.tampada = true;
        }

        public void destampar () {
            this.tampada = false;
        }

        public void status(){
            System.out.println("\nINFORMAÇÕES DA CANETA: ");
            System.out.println("MODELO: " + this.modeloCaneta);
            System.out.println("COR: " + this.corCaneta);
            System.out.println("PONTA: " + getPontaCaneta() + "mm.");
            System.out.println("TAMPADA: " + getTampada() + ".\n");
        }


}
