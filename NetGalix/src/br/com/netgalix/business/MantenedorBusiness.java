package br.com.netgalix.business;

import java.sql.SQLException;

import br.com.netgalix.dao.ProdutoDAO;
import br.com.netgalix.entidades.Produto;

public class MantenedorBusiness {
	private Produto produto;
	private ProdutoDAO produto_dao;
	
	
	public MantenedorBusiness(){
		produto = new Produto();
		produto_dao =  new ProdutoDAO();
	}
	public boolean inserirProduto(Produto produto){
		try{
			produto_dao.inserir(produto);
			return true;
		}
		catch (SQLException ex){
			ex.printStackTrace();
			return false;
		}
		
	}
	

}
