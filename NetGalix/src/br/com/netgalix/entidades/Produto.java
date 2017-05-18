package br.com.netgalix.entidades;

import javax.persistence.*;

@Entity
@Table(name="estoque", schema="comercio")
public class Produto {

	@Id 
	@SequenceGenerator(name = "SEQ_ESTOQUE",sequenceName = " comercio.estoque_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTOQUE")  
	private Long id;
	private Long id_subgrupo;
	private String nome_produto;
	private double preco_produto;
	private String descricao_produto; //Como vou pegar Text no BD
	private Integer id_estoque;
    private int quantidade_item_estoque;
	private boolean status_estoque;
	private int qtd_acesso;
	
	public int getQtd_acesso() {
		return qtd_acesso;
	}

	public void setQtd_acesso(int qtd_acesso) {
		this.qtd_acesso = qtd_acesso;
	}

	public int getQuantidade_item_estoque() {
		return quantidade_item_estoque;
	}

	public void setQuantidade_item_estoque(int quantidade_item_estoque) {
		this.quantidade_item_estoque = quantidade_item_estoque;
	}

	public boolean getStatus_produto() {
		return status_estoque;
	}

	public void setStatus_estoque(boolean status_produto) {
		this.status_estoque = status_produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_subgrupo() {
		return id_subgrupo;
	}

	public void setId_subgrupo(Long id_subgrupo) {
		this.id_subgrupo = id_subgrupo;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public double getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(double preco_produto) {
		this.preco_produto = preco_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Integer getId_estoque() {
		return id_estoque;
	}

	public void setId_estoque(Integer id_estoque) {
		this.id_estoque = id_estoque;
	}
	
		
	
	
}
