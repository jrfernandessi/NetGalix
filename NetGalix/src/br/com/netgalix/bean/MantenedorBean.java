package br.com.netgalix.bean;

import br.com.netgalix.business.MantenedorBusiness;
import br.com.netgalix.entidades.Mantenedor;
import br.com.netgalix.entidades.Produto;

public class MantenedorBean {
	private Produto produto;
	private MantenedorBusiness mantenedor;
	private Mantenedor mantenedor_entidade;
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public MantenedorBusiness getMantenedor() {
		return mantenedor;
	}

	public void setMantenedor(MantenedorBusiness mantenedor) {
		this.mantenedor = mantenedor;
	}

	public MantenedorBean(){
		this.produto = new Produto();
		this.mantenedor = new MantenedorBusiness();
		this.mantenedor_entidade = new Mantenedor();
	}
	
	public String salvarProduto(){
		
		if(mantenedor.inserirProduto(produto) == true){
			produto.setStatus_estoque(true);
			produto.setQtd_acesso(0);
			mantenedor_entidade.setIdProduto(produto.getId());
			return "produtoSucesso";
		}
		else
			return "erroProduto";
		
	}
	
}

