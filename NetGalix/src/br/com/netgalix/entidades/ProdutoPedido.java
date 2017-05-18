package br.com.netgalix.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pedido_estoque", schema="comercio")
public class ProdutoPedido {

	@Id 
	@SequenceGenerator(name = "SEQ_PEDIDO_ESTOQUE",sequenceName = " comercio.pedido_estoque_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO_ESTOQUE")  
	private Long id;
	private Long id_produto;
	private int quantidade_item_produto;
	private Long id_pedido;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_produto() {
		return id_produto;
	}
	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}
	public int getQtd_item_produto() {
		return quantidade_item_produto;
	}
	public void setQtd_item_produto(int qtd_item_produto) {
		this.quantidade_item_produto = qtd_item_produto;
	}
	public Long getId_pedido() {
		return id_pedido;
	}
	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}
}
