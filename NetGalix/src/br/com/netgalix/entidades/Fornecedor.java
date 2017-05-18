package br.com.netgalix.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="fornecedor", schema="comercio")
public class Fornecedor {

	@Id 
	@SequenceGenerator(name = "SEQ_FORNECEDOR",sequenceName = " comercio.fornecedor_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_FORNECEDOR")  
	private Long id;
	private Long id_produto;
	private String telefone_fornecedor;
	private String cnps_fornecedor;
	private String endereco_fornecedor;
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
	public String getTelefone_fornecedor() {
		return telefone_fornecedor;
	}
	public void setTelefone_fornecedor(String telefone_fornecedor) {
		this.telefone_fornecedor = telefone_fornecedor;
	}
	public String getCnps_fornecedor() {
		return cnps_fornecedor;
	}
	public void setCnps_fornecedor(String cnps_fornecedor) {
		this.cnps_fornecedor = cnps_fornecedor;
	}
	public String getEndereco_fornecedor() {
		return endereco_fornecedor;
	}
	public void setEndereco_fornecedor(String endereco_fornecedor) {
		this.endereco_fornecedor = endereco_fornecedor;
	}
	
	
	
}
