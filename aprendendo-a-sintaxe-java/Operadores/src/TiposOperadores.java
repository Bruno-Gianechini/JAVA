public class TiposOperadores {
    public static void main(String[] args)
    {    
        // OPERADORES ARITMÉTICOS.
        // realiza operações matemáticas.
            /*    
                (+)         adição
                (-)         subtração
                (/)         divisão
                (*)         multiplicação
            */

        // OPERADORES UNÁRIOS.
        // alteram características de um determinado valor.
            /*
                (+)         valor positivo
                (-)         valor negativo
                (++)        incremento de valor
                (--)        decremento de valor
                (!)         lógica de negação
            */

        // OPERADORES RELACIONAIS.
        // realiza comparações entre valores.
            /*
                (>)         maior que
                (<)         menor que
                (>=)        maior ou igual
                (<=)        menor ou igual
                (==)        compara igualdade
                (!=)        verifica diferença
                (equals)    metodo que compara objetos
            */

        // OPERADORES LÓGICOS.
        // cria condições condicionais mais complexas.
            /*
                (&&)        E
                (||)        OU
            */

        // TERNÁRIO (?:) SIMPLIFICA EXPRESSÕES.
		// simplifica expressões condicionais.
                int a,b;
                a = 1;
                b = 2;
                String resultado;

            //  EXEMPLO NÃO SIMPLIFICADO.
                if(a==b)
                    resultado = "Comum: Verdadeiro";
                else
                    resultado = "Comum: Falso";
                System.out.println(resultado);

            //  EXEMPLO SIMPLIFICADO.
                resultado = a==b ?   "Simplificado: Verdadeiro" : "Simplificado: Falso";
                System.out.println(resultado);
    }    
}