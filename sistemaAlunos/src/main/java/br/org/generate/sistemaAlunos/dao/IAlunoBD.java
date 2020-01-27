package br.org.generate.sistemaAlunos.dao;

import org.springframework.data.repository.CrudRepository;

import br.org.generate.sistemaAlunos.model.Aluno;

public interface IAlunoBD extends CrudRepository<Aluno, Integer> {

}
