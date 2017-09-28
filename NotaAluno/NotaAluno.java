/**
 * Representa uma aluno. Um aluno possui matricula, nome e 3 notas.
 *
 * @author Erick de Oliveira Silva
 * @version 2017.09.27
 */

import java.lang.Comparable;

public class NotaAluno implements Comparable< NotaAluno >
{
	// Matricula do aluno
	private int matricula;
	// Nome do aluno
	private String nomeAluno;
	// Primeira nota do aluno
	private double nota1;
	// Segunda nota do aluno
	private double nota2;
	// Terceira nota do aluno
	private double nota3;

	/**
	 * Construtor para um aluno.
	 *
	 * @param matricula Numero de matricula do aluno.
	 * @param nomeAluno Nome do aluno.
	 * @param nota1 Primeira nota do aluno.
	 * @param nota2 Segunda nota do aluno.
	 * @param nota3 Terceira nota do aluno.
	 *
	 * @throws IllegalArgumentException se matricula for negativa, ou nomeAluno for nulo, ou (nota1, nota2 ou nota3) forem negativas.
	 */
	public NotaAluno( int matricula, String nomeAluno, double nota1, double nota2, double nota3 )
		throws IllegalArgumentException
	{
		setMatricula( matricula );
		setNomeAluno( nomeAluno );
		setNotas( nota1, nota2, nota3 );
	}
	
	/**
	 * Seta a matricula do aluno.
	 *
	 * @param      matricula  Matricula do aluno
	 *
	 * @throws     IllegalArgumentException  se matricula for negativa.
	 */
	public void setMatricula( int matricula )
	{
		if( matricula < 0  )
		{
			throw new IllegalArgumentException( "O numero de matricula não pode ser negativo!!!" );
		} else
		{
			this.matricula = matricula;
		}
	}

	/**
	 * Resgata o valor da matricula do aluno
	 *
	 * @return     A matricula do aluno.
	 */
	public int getMatricula()
	{
		return matricula;
	}

	/**
	 * Seta o nome do aluno.
	 *
	 * @param      nomeAluno  Nome do aluno.
	 * 
	 * @throws IllegalArgumentException se nomeAluno for null.
	 */
	public void setNomeAluno( String nomeAluno )
	{
		if( nomeAluno == null )
		{
			throw new IllegalArgumentException( "O nome do alunonão pode ser null!!" );
		} else 
		{
			this.nomeAluno = nomeAluno;
		}

	}

	/**
	 * Resgata o nome do aluno.
	 *
	 * @return     O nome do aluno.
	 */
	public String getNomeAluno()
	{
		return nomeAluno;
	}

	/**
	 * Seta todas as notas do aluno.
	 *
	 * @param      nota1  Primeira nota do aluno
	 * @param      nota2  Segunda nota do aluno
	 * @param      nota3  Terceira nota do aluno
	 * 
	 * @throws IllegalArgumentException  se alguma das notas for negativa
	 */
	public void setNotas( double nota1, double nota2, double nota3 )
	{
		if( nota1 < 0 || nota2 < 0 || nota3 < 0 )
		{
			throw new IllegalArgumentException( "Nenhuma das notas pode ser negativa!!" );
		} else 
		{
			this.nota1 = nota1;
			this.nota2 = nota2;
			this.nota3 = nota3;
		}

	}

	/**
	 * Resgata o valor da primeira nota do primeiro aluno.
	 *
	 * @return     A primeira nota do aluno.
	 */
	public double getNota1()
	{
		return nota1;
	}

	/**
	 * Resgata o valor da segunda nota do primeiro aluno.
	 *
	 * @return     A segunda nota do aluno.
	 */
	public double getNota2()
	{
		return nota2;
	}

	/**
	 * Resgata o valor da terceira nota do primeiro aluno.
	 *
	 * @return     A terceira nota do aluno.
	 */
	public double getNota3()
	{
		return nota3;
	}

	/**
	 * Retorna a representação do objeto em forma de String.
	 *
	 * @return     Representação em texto do aluno.
	 */
	@Override
	public String toString()
	{
		return 	  "\nMatricula : " + getMatricula() 
				+ "\nNome : " + getNomeAluno()
				+ "\nNota 1 : " + getNota1()
				+ "\nNota 2 : " + getNota2()
				+ "\nNota 3 : " + getNota3();
	}

	
	/**
	 * Compara dois alunos e diz qual é o maior, com base na media aritmetica das notas.
	 *
	 * @param      aluno  The aluno
	 *
	 * @return     { description_of_the_return_value }
	 */
	@Override
	public int compareTo( NotaAluno aluno )
	{
		double media_this 	= ( this.getNota1() + this.getNota2() + this.getNota3() )/3;
		double media_other  = ( aluno.getNota1() + aluno.getNota2() + aluno.getNota3() )/3;

		if( media_this < media_other )
		{
			return -1;
		} else if ( media_this > media_other )
		{
			return 1;
		}

		return 0;
	}

}
