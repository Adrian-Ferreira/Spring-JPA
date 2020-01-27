package br.org.generate.sistemaAlunos.servicos;

import br.org.generate.sistemaAlunos.model.Aluno;

public interface IAlunoService {
	
	public void gravarAlunoNoBanco(Aluno aluno);
	public void atualizarAlunoNoBanco(Aluno aluno);
	public Aluno recuperarAlunoPorId(int id);
}
