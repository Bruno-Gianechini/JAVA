public class Veiculo 
{
    //  ATRIBUTOS.
        private String marca;
        private String modelo;
        private String cor;
        private int rodas;
        private int tanque;
        private Boolean acelerar;
        private Boolean frear;

    //  MÉTODO CONSTRUTOR.
        Veiculo(String marca, String modelo, String cor, int rodas, int tanque){
            acelerar = false;
            frear = false;
        }

    //  MÉTODOS (SETTERS E GETTERS).
        public void setMarca (String marca){
            this.marca = marca;
        }
        public String getMarca (){
            return marca;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;
        }
        public String getModelo(){
            return modelo;
        }

        public void setCor (String cor){
            this.cor = cor;
        }
        public String getCor(){
            return cor;
        }

        public void setRodas (int rodas){
            this.rodas = rodas;
        }
        public int getRodas(){
            return rodas;
        }

        public void setTanque (int tanque){
            this.tanque = tanque;
        }
        public int getTanque(){
            return tanque;
        }

    //  MÉTODOS
        public void acelerar(){
            this.acelerar = true;
            this.frear = false;
        }
        public void frear(){
            this.frear = true;
            this.acelerar = false;
        }
    }