/**
 * Representa uma Calculadora implementando a interface Calculavel.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.27
 */

import java.lang.*;
import java.util.Stack;

public class Calculadora implements Calculavel
{
    
    // Pilha de resultados.
    private Stack< Double > resultados;
    
    // Pilha de operações.
    private Stack< String > operacoes;
    
    /**
     * Construtor padrao.
     */
    public Calculadora()
    {
        // Inicializa a pilha de resultados
        resultados = new Stack< Double >();
        
        // Inicializa a pilha de operacoes
        operacoes = new Stack< String >();
    }        
    

    @Override
    public double somar( double a, double b ) 
    {
        // Salva o resultado na pilha.
        resultados.push( a + b );
        
        // Salva uma representacao da operacao, apenas para impressao.
        operacoes.push( "Soma " + a + " + " + b + " = " );
        
        return a + b;
    }

    @Override
    public double subtrair( double a, double b ) 
    {
        // Salva o resultado na pilha.
        resultados.push( a-b );
        // Salva uma representacao da operacao, apenas para impressao.
        if( b < 0 )
        {
            operacoes.push( "Subtracao " + a + " - (" + b + ") = " );
        } else 
        {
            operacoes.push( "Subtracao " + a + " - " + b + " = " );
        }
        
        return a - b;
    }

    @Override
    public double multiplicar( double a, double b ) 
    {
        // Salva o resultado da pilha.
        resultados.push( a * b );
        // Salva a representacao da operacao, apenas para impressao.
        operacoes.push( "Multiplicacao " + a + " * " + b + " = " );
        
        return a * b;
    }

    @Override
    public double dividir( double a, double b ) throws ArithmeticException
    {
       double divisao = 0;
       try
       {
           divisao = a/b;
           // Salva o resultado na pilha.
           resultados.push( divisao );
           // Salva a representacao da operacao, apenas para impressao.
           operacoes.push( "Divisao " + a + " / " + b + " = " );
       } catch( ArithmeticException e )
       {
           System.out.println( "Divisao por 0, indefinicao, cancelando operacao!!" );
           return -1;
       }
       
       return divisao;
    }

    @Override
    public double potencia( double a, double b ) 
    {
        // Salva o resultado na pilha.
        resultados.push( Math.pow( a, b ) );
        // Salva a representacao da operacao, apenas para impressao.
        operacoes.push( "Potenciacao " + a + "^" + b + " = " );
        
        return Math.pow( a, b );
    }

    @Override
    public double raizQuadrada( double a ) 
    {
        // Salva o resultado na pilha.
        resultados.push( Math.sqrt( a ) );
        // Salva a representacao da operacao, apenas para impressao.
        operacoes.push( "Raiz Quadrada de " + a + " = " );
        
        return Math.sqrt( a );
    }
    
    /**
     * Exibe os resultados de operacoes armazenada na pilha e esvazia a mesma.
     */
    public void exibirResultados()
    {
        // Mostra e desempilha cada operacao e resultado.
        while( !( resultados.empty() && operacoes.empty() ) )
        {
            System.out.println( operacoes.pop() + resultados.pop() );
        }
    }
    
}
