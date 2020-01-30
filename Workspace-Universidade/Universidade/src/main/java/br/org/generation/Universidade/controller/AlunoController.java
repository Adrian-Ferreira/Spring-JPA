package br.org.generation.Universidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.Universidade.model.Aluno;
import br.org.generation.Universidade.service.IAlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private IAlunoService service;
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> mostrarTodos(){
		return ResponseEntity.ok(service.recuperarTodos());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> mostarPeloId(@PathVariable int id){
		Aluno p = service.recuperaPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping ("/aluno/novo")
	public ResponseEntity<Aluno> noovoProduto(@RequestBody Aluno aluno){
		service.novoAluno(aluno);
		return ResponseEntity.ok(aluno);
	}
	
}
