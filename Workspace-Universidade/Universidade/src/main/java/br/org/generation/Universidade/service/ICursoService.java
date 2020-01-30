package br.org.generation.Universidade.service;

import java.util.List;

import br.org.generation.Universidade.model.Curso;

public interface ICursoService {

	public void adicionarNovoCurso(Curso depto);
	public Curso recuperarDetalhes(int id);
	public List<Curso> recuperarTodos();
}
