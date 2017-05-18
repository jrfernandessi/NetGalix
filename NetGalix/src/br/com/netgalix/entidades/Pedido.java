package br.com.netgalix.entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="pedido", schema="comercio")
public class Pedido {

	@Id 
	@SequenceGenerator(name = "SEQ_PEDIDO",sequenceName = " comercio.pedido_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO")  
	private Long id;
	private Date data;
	private Long id_usuario;
	private boolean status_pedido;
	private int quantidade_itens;
	private double valor_pedido;
	private int hora_pedido;
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public boolean isStatus_pedido() {
		return status_pedido;
	}
	public void setStatus_pedido(boolean status_pedido) {
		this.status_pedido = status_pedido;
	}
	public int getQuantidade_itens() {
		return quantidade_itens;
	}
	public void setQuantidade_itens(int quantidade_itens) {
		this.quantidade_itens = quantidade_itens;
	}
	public double getValor_pedido() {
		return valor_pedido;
	}
	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
	public int getHora_pedido() {
		return hora_pedido;
	}
	public void setHora_pedido(int hora_pedido) {
		this.hora_pedido = hora_pedido;
	}
}
