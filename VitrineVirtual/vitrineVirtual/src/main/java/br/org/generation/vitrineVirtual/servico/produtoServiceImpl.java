package br.org.generation.vitrineVirtual.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.org.generation.vitrineVirtual.dao.produtoRepo;
import br.org.generation.vitrineVirtual.model.produto;

@Component
public class produtoServiceImpl implements IprodutoServico{
	
	@Autowired						// declaramos a interface do DAO que criamos
	private produtoRepo repo;		// e a anotação Autowired busca uma implementação dentro do JPA

	@Override
	public List<produto> recuperarTodos() {
		// isso corresponde a um
		//		select * from tblproduto
		//			inner join tbldepartamento
		//			on tblproduto.departamento_id = departamento.id
		return (List<produto>)repo.findAll();
	}

	@Override
	public produto recuperaPorId(int id) {
		return repo.findById(id).get();
	}

}
