/**
 * Classe principal, para executar testes de NotaAluno.
 * 
 * @author Erick de Oliveira Silva
 * @version 2017.09.27
 */
public class Main
{
	public static void main( String[] args )
	{
		//  Cria a database.
		Database database = new Database();

		// Instacia 5 novos alunos.
		NotaAluno aluno1 = new NotaAluno( 1, "Aluno1", 	10, 10, 10 );
		NotaAluno aluno2 = new NotaAluno( 2, "Aluno2",  9, 9, 9 );
		NotaAluno aluno3 = new NotaAluno( 3, "Aluno3",  8, 8, 8 );
		NotaAluno aluno4 = new NotaAluno( 4, "Aluno4",  7, 7, 7 );
		NotaAluno aluno5 = new NotaAluno( 5, "Aluno5",  5, 5, 5 );

		// Os adiciona na database.
		database.addAluno( aluno1 );
		database.addAluno( aluno2 );
		database.addAluno( aluno3 );
		database.addAluno( aluno4 );
		database.addAluno( aluno5 );

		// Testa metodo para obter quantidade da alunos.
		System.out.println( "Quantidade de alunos : " + database.qtdAlunos() );

		System.out.println( ">>> LISTA ANTES DE ORDENAR <<<" );

		// Mostra a lista de alunos antes de ordenar.
		database.print();

		// Ordena os alunos em ordem crescente com base na media aritmetica das notas.
		database.ordenarDatabase();

		System.out.println( "\n>>> LISTA APÓS ORDENAR <<<" );

		// Mostra a lista de alunos antes de ordenar.
		database.print();
	}
}