package br.com.netgalix.entidades;

import javax.persistence.*;

@Entity
@Table(name="grupo", schema="comercio")
public class Grupo {

	@Id 
	@SequenceGenerator(name = "SEQ_GRUPO",sequenceName = "comercio.grupo_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_GRUPO")  
	private Long id;
	private String nome_grupo;
	private boolean status_grupo;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome_grupo() {
		return nome_grupo;
	}
	public void setNome_grupo(String nome_grupo) {
		this.nome_grupo = nome_grupo;
	}
	public boolean isStatus_grupo() {
		return status_grupo;
	}
	public void setStatus_grupo(boolean status_grupo) {
		this.status_grupo = status_grupo;
	}
}
