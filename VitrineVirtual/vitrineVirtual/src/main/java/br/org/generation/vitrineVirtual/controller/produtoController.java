package br.org.generation.vitrineVirtual.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.vitrineVirtual.model.produto;
import br.org.generation.vitrineVirtual.servico.IprodutoServico;

@RestController
@CrossOrigin("*")
public class produtoController {
	
	@Autowired
	private IprodutoServico servico;
	
	@GetMapping("/produto")
	public ResponseEntity<List<produto>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
		
	}
	
	@GetMapping("/produto/{id}")
	public ResponseEntity<produto> mostarPeloId(@PathVariable int id){
		produto p = servico.recuperaPorId(id);
		if (p != null) {
			return ResponseEntity.ok(p);
		}
		return ResponseEntity.notFound().build();
	}
}