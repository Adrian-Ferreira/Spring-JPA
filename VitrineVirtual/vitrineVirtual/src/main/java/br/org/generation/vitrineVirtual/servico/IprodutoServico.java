package br.org.generation.vitrineVirtual.servico;

import java.util.List;

import br.org.generation.vitrineVirtual.model.produto;

public interface IprodutoServico {

	public List<produto> recuperarTodos();
	public produto recuperaPorId(int id);
	
}
