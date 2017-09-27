/**
 * Implementa uma Interface Java para uma calculadora.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.27
 */

public interface Calculavel 
{
    
    /**
     * Soma dois numeros double e salva o resultado em um pilha.
     * 
     * @param a Primeiro parametro double.
     * @param b Segundo  parametro double.
     */
    public double somar( double a, double b );
    
    /**
     * Subtrai o primeiro parametro pelo segundo parametro e salva o resultado em uma pilha.
     * 
     * @param a Primeiro parametro  double.
     * @param b Segundo parametro double.
     */
    public double subtrair( double a, double b );
    
    /**
     * Multiplica dois numeros de double e salva o resultado em uma pilha.
     * 
     * @param a Primeiro parametro double.
     * @param b Segundo parametro double.
     */
    public double multiplicar( double a, double b );
    
    /**
     * Divide o primeiro parametro pelo segundo e salva o resultado em uma pilha. 
     * Sendo o segundo parametro diferente de 0.
     * 
     * @param a Primeiro parametro double.
     * @param b Segundo parametro double.
     * 
     * @throws ArithmeticException se b é igual a 0.
     */
    public double dividir( double a, double b ) throws ArithmeticException;
    
    /**
     * Calcula a potenciacao tendo o primeiro parametro com base e o segundo como expoente.
     *  Salva o resultado em uma pilha.
     * 
     * @param a Base da potenciacao.
     * @param b Expoente da potenciacao.
     */
    public double potencia( double a, double b );
    
    /**
     * Calcula a raiz quadrada do parametro e salva o resultado em uma pilha.
     * 
     * @param a Radical da radiciacao.
     */
    public double raizQuadrada( double a );
}
