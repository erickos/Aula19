import java.util.ArrayList;
import java.util.Collections;

/**
 * Banco de dados de Alunos.
 */
public class Database
{
	// ArrayList de alunos.
	private ArrayList< NotaAluno > alunos;



	/**
	 * Construtor padrao, apenas inicia o ArrayList.
	 */
	public Database()
	{
		alunos = new ArrayList< NotaAluno >();
	}


	/**
	 * Adiciona um aluno no banco de dados.
	 *
	 * @param      aluno  Aluno a ser adicionado.
	 */
	public void addAluno( NotaAluno aluno )
	{
		alunos.add( aluno );
	}


	/**
	 * Remove um aluno da base de dados.
	 *
	 * @param      aluno  The alunoAluno a ser removido.
	 */
	public void removeAluno( NotaAluno aluno )
	{
		alunos.remove( aluno );
	}

	/**
	 * Ordena a lista em ordem crescente com base na media aritmetica das notas.
	 */
	public void ordenarDatabase()
	{
		// Utiliza o sort do Collection, porém o compareTo foi sobreescrito na classa NotaAluno.
		Collections.sort( alunos );
	}

	/**
	 * Imprime todos os alunos na database.
	 */
	public void print()
	{
		for( NotaAluno current : alunos )
		{
			System.out.println( ">>> Aluno " + current.getMatricula() + " <<<\n" + current );
		}
	}


	/**
	 * Resgata a quantidade de aluno no banco de dados.
	 *
	 * @return     A quantidade de alunos.
	 */
	public int qtdAlunos()
	{
		return alunos.size();
	}
}