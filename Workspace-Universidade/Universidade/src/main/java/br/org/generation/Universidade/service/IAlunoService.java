package br.org.generation.Universidade.service;

	import java.util.List;

	import br.org.generation.Universidade.model.Aluno;

	public interface IAlunoService{

		public List<Aluno> recuperarTodos();
		public Aluno recuperaPorId(int id);
		public void novoAluno(Aluno aluno);
		
	}

