/**
 * Classe principal para execução dos testes de Calculadora.
 *
 * @author     Erick de Oliveira Silva
 * @version    2017.09.27
 */

import static java.lang.Double.NaN;

public class Main 
{
    private static final double A_POSITIVO =   5;
    private static final double A_NEGATIVO =  -5;
    private static final double B_POSITIVO =  10;
    private static final double B_NEGATIVO = -10;
    private static final double ZERO       =   0;
    
    public static void main(String[] args) 
    {
      
        Calculadora calc = new Calculadora();
        
        System.out.println( ">>> INICIANDO TESTES <<<" );
    /**
     * Testes de soma.
     */
     // dois positivos
        assert( 15 == calc.somar( A_POSITIVO, B_POSITIVO ) );
        
        // dois negativos
        assert( -15 == calc.somar( A_NEGATIVO, B_NEGATIVO ) );
        
        // a negativo e b positivo.
        assert( 5 == calc.somar( A_NEGATIVO, B_POSITIVO ) );
        
        // a positivo e b negativo.
        assert( -5 == calc.somar( A_POSITIVO, B_NEGATIVO ) );
        
        // soma com 0.
        assert( A_POSITIVO == calc.somar( A_POSITIVO, ZERO ) );
        
        System.out.println(">>> SOMA OK <<<");
    
    /**
     * Testes de subtracao.
     */
        // dois positivos
        assert( -5 == calc.subtrair( A_POSITIVO, B_POSITIVO ) );
        
        // dois negativos
        assert(  5 == calc.subtrair( A_NEGATIVO, B_NEGATIVO ) );
        
        // a negativo e b positivo.
        assert( -15 == calc.subtrair( A_NEGATIVO, B_POSITIVO ) );
        
        // a positivo e b negativo.
        assert( 15 == calc.subtrair( A_POSITIVO, B_NEGATIVO ) );
        
        // subtracao por 0.
        assert( A_POSITIVO == calc.subtrair( A_POSITIVO, ZERO ) );
        
        // subtrair de 0.
        assert( A_NEGATIVO == calc.subtrair( ZERO ,A_POSITIVO ) );
        
        System.out.println( ">>> SUBTRACAO OK <<<" );
    
    
    /**
     * Testes de multiplicacao.
     */
        // dois positivos
        assert( 50 == calc.multiplicar( A_POSITIVO, B_POSITIVO ) );
        
        // dois negativos
        assert( 50 == calc.multiplicar( A_NEGATIVO, B_NEGATIVO ) );
        
        // a negativo e b positivo.
        assert( -50 == calc.multiplicar( A_NEGATIVO, B_POSITIVO ) );
        
        // a positivo e b negativo.
        assert( -50 == calc.multiplicar( A_POSITIVO, B_NEGATIVO ) );
        
        // multiplicacao por 0.
        assert( 0 == calc.multiplicar( A_POSITIVO, ZERO ) );
        
        System.out.println(">>> MULTIPLICACAO OK <<<");
    
    
    /**
     * Testes de divisao.
     */
        // a positivo por b positivo
        assert( 0.5 == calc.dividir( A_POSITIVO, B_POSITIVO ) );
        
        // a negativo por b negativo
        assert( 0.5 == calc.dividir( A_NEGATIVO, B_NEGATIVO ) );
        
        // b negativo por a positivo.
        assert( -2 == calc.dividir( B_NEGATIVO, A_POSITIVO ) );
        
        // b positivo por a negativo.
        assert( -2 == calc.dividir( B_POSITIVO, A_NEGATIVO ) );
        
        // divisao por 0.
        assert( -1 == calc.dividir( A_POSITIVO, ZERO ) );
        
        // divisao de 0
        assert( 0 == calc.dividir( ZERO ,A_POSITIVO ) );
        
        
        System.out.println( ">>> DIVISAO OK <<<" );
        
        
    /*
     * Testes de potenciacao
     */
        // a positivo por b positivo
        assert( Math.pow( A_POSITIVO, B_POSITIVO ) == calc.multiplicar( A_POSITIVO, B_POSITIVO ) );
        
        // a negativo por b negativo
        assert( Math.pow( A_NEGATIVO, B_POSITIVO ) == calc.multiplicar( A_NEGATIVO, B_POSITIVO ) );
        
        // b negativo por a positivo.
        assert( Math.pow( A_POSITIVO, B_NEGATIVO ) == calc.multiplicar( A_POSITIVO, B_NEGATIVO ) );
        
        // b positivo por a negativo.
        assert( Math.pow( A_NEGATIVO, B_NEGATIVO ) == calc.multiplicar( A_NEGATIVO, B_NEGATIVO ) );
        
        // expoente igual a 0.
        assert( 1 == calc.multiplicar( A_POSITIVO, ZERO ) );
        
        // base igual a 0
        assert( 0 == calc.multiplicar( ZERO ,A_POSITIVO ) );
        
        System.out.println( ">>> POTENCIACAO OK <<<" );
        
    /*
     * Testes para raiz quadrada
     */
        // raiz quadrada de numero positivo
        assert( 5 == calc.raizQuadrada( 25 ) );
        
        // raiz quadrada de numero negativo.
        assert( NaN == calc.raizQuadrada( -1 ) );
        
        System.out.println( ">>> RAIZ QUADRADA OK <<<" );
        
        System.out.println( ">>> IMPRIMINDO OPERACOES SOLICITADAS NOS TESTES <<<" );
        
    /**
     * Teste exubirResultados
     */ 
        // Inserindo na pilha.
        calc.somar( 10, 5 );
        calc.subtrair( 10, 5 );
        calc.multiplicar( 10, 5);
        calc.dividir( 10, 5 );
        calc.potencia( 10, 5 );
        calc.raizQuadrada( 25 );
        
        calc.exibirResultados( );
        
        System.out.println( ">>> exibirResultados() OK <<<" );
        
        System.out.println( ">>> TESTES CONCLUIDOS <<<" );
    
    }
}
