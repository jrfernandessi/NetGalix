package br.com.netgalix.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="subgrupo", schema="comercio")
public class SubGrupo {

	@Id 
	@SequenceGenerator(name = "SEQ_SUBGRUPO",sequenceName = " comercio.subgrupo_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_SUBGRUPO")  
	private Long id;
	private Long id_grupo;
	private String nome_subgrupo;
	private boolean status_subgrupo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId_grupo() {
		return id_grupo;
	}
	public void setId_grupo(Long id_grupo) {
		this.id_grupo = id_grupo;
	}
	public String getNome_subgrupo() {
		return nome_subgrupo;
	}
	public void setNome_subgrupo(String nome_subgrupo) {
		this.nome_subgrupo = nome_subgrupo;
	}
	public boolean isStatus_subgrupo() {
		return status_subgrupo;
	}
	public void setStatus_subgrupo(boolean status_subgrupo) {
		this.status_subgrupo = status_subgrupo;
	}
}
