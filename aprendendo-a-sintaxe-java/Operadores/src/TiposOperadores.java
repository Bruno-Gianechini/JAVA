//  INÍCIO CLASSE.
    public class TiposOperadores 
{
    public static void main(String[] args)
    {    
        //  INÍCIO OPERADORES ARITMÉTICOS.
        //  realiza operações matemáticas.
            /*    
                (+)         adição
                (-)         subtração
                (/)         divisão
                (*)         multiplicação
            */
        //  FIM OPERADORES ARITMÉTICOS.

        //  INÍCIO OPERADORES UNÁRIOS.
        //  alteram características de um determinado valor.
            /*
                (+)         valor positivo
                (-)         valor negativo
                (++)        incremento de valor
                (--)        decremento de valor
                (!)         lógica de negação
            */
        //  FIM OPERADORES UNÁRIOS.

        //  INÍCIO OPERADORES RELACIONAIS.
        //  realiza comparações entre valores.
            /*
                (>)         maior que
                (<)         menor que
                (>=)        maior ou igual
                (<=)        menor ou igual
                (==)        compara igualdade
                (!=)        verifica diferença
                (equals)    metodo que compara objetos
            */
        //  FIM OPERADORES RELACIONAIS.

        //  INÍCIO OPERADORES LÓGICOS.
        //  cria condições condicionais mais complexas.
            /*
                - CONJUNÇÃO: Operação lógica que só é verdadeira quando ambos os operandos forem verdadeiros
                - TERMINOLOGIA: E / AND.
                - SIMBOLOGIA: &&
                
                - DISJUNÇÃO: Operação lógica que só é falso quando ambos os operandos forem falsos.
                - TERMINOLOGIA: OU / OR.
                - SIMBOLOGIA: ||
            
                - DISJUNÇÃO EXCLUSIVA: Operação que só é verdadeira quando ambos os operandos ou ambas as expressões forem opostas.
                - TERMINOLOGIA: OU EXCLUSIVO / XOR
                - SIMBOLOGIA: ^

                - NEGAÇÃO: Valor lógico que inverte o resultado de um operando ou uma expressão.
                - TERMINOLOGIA: INVERSOR.
                - SIMBOLOGIA: !
            */
        //  FIM OPERADORES LÓGICOS

        //  INÍCIO OPERADORES TERNÁRIOS (?:).
		//  simplifica expressões condicionais.

            //  INÍCIO VARIÁVEIS.
                int a,b;
                a = 1;
                b = 2;
                String resultado;
            //  FIM VARIÁVEIS.

            //  INÍCIO EXEMPLO NÃO SIMPLIFICADO.
                if(a==b)
                    resultado = "Comum: Verdadeiro";
                else
                    resultado = "Comum: Falso";
                System.out.println(resultado);
            //  FIM EXEMPLO NÃO SIMPLIFICADO.
    
            //  INÍCIO EXEMPLO SIMPLIFICADO.
                resultado = a==b ?   "Simplificado: Verdadeiro" : "Simplificado: Falso";
                System.out.println(resultado);
            //  FIM EXEMPLO SIMPLIFICADO.
        
        //  FIM OPERADORES TERNÁRIOS.

    }    
}
//  FIM CLASSE.