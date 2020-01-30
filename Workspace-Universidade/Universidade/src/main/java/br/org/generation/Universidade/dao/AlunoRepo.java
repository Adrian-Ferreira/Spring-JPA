package br.org.generation.Universidade.dao;

import org.springframework.data.repository.CrudRepository;
import br.org.generation.Universidade.model.Aluno;

public interface AlunoRepo extends CrudRepository<Aluno, Integer> {

	
}
