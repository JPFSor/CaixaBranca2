package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 * 
 * <p>Esta classe ao ser compilada testará o funcionamento da classe Calculadora, 
 * utilizando valores pré-definidos para que os métodos sejam testados de maneira unitária e segura.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em código Java</li>
 *      <li>Documentação em JavaDoc</li>
 * 
 * </ul>
 * * <p>Após a refatoração, foram adicionados os blocos de try e catch para verificar o tratamento de casos de exceção</p>
 * 
 * @author João Pedro Fernandes Rosa de Paula
 * @version 2.0
 */
public class TesteCalculadora {
    /**
     * <p>Método main() para testes do código:</p>
     * @param args
     */
    public static void main(String[] args) {
        /**
         * <p>Objeto "calc" criado para utilização dos métodos da classe Calculadora:</p>
         */
        Calculadora calc = new Calculadora();

        /**
         * <p>Testes unitários utilizando cada um dos operadores:</p>
         */
        System.out.println(calc.calcular(2, 3, "+")); //Soma("+"): 2 + 3 = 5
        System.out.println(calc.calcular(10, 4, "-")); //Subtração("-"): 10 - 4 = 6
        System.out.println(calc.calcular(3, 5, "*")); //Multiplicação("*"): 3 * 5 = 15
        System.out.println(calc.calcular(8, 2, "/")); //Divisão("/"): 8 / 2 = 4

        /**
         * <p>Bloco try e catch para teste do tratamento da exceção de divisão por 0:</p>
         * <p>Try tenta realizar a operação, em caso de erro, 
         * o catch busca a mensagem deixada no método IllegalArgumentException inserida na classe Calculadora,
         * nesse caso, "Divisão por zero não é permitida"</p>
         */
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        /**
         * <p>Bloco try e catch para teste do tratamento da exceção do uso de operador indevido:</p>
         * <p>Try tenta realizar a operação, em caso de erro, 
         * o catch busca a mensagem deixada no método IllegalArgumentException inserida na classe Calculadora,
         * nesse caso, "Operador inválido: " + operador utilizado</p>
         */
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
