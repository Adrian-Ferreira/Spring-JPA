package br.org.generation.Universidade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.Universidade.dao.AlunoRepo;
import br.org.generation.Universidade.model.Aluno;

@Component
public class AlunoServiceImpl implements IAlunoService {

	@Autowired						
	private AlunoRepo repo;		

	@Override
	public List<Aluno> recuperarTodos() {

		return (List<Aluno>)repo.findAll();
	}

	@Override
	public Aluno recuperaPorId(int id) {
		return repo.findById(id).get();
	}
	
	@Override
	public void novoAluno(Aluno aluno) {
		repo.save(aluno);
	}
}
