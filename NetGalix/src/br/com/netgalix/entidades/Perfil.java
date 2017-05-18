	package br.com.netgalix.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="perfil", schema="comercio")
public class Perfil {

	@Id 
	@SequenceGenerator(name = "SEQ_PERFIL",sequenceName = " comercio.perfil_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_PERFIL")  
	 private Long id;
	 private Date data_criacao;
	 private boolean status_perfil;
	 private Long id_usuario;
	 private Long id_papel;
	 
	public Long getId_papel() {
		return id_papel;
	}
	public void setId_papel(Long id_papel) {
		this.id_papel = id_papel;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData_criacao() {
		return data_criacao;
	}
	public void setData_criacao(Date data_criacao) {
		this.data_criacao = data_criacao;
	}
	public boolean isStatus_perfil() {
		return status_perfil;
	}
	public void setStatus_perfil(boolean status_perfil) {
		this.status_perfil = status_perfil;
	}
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	 
	 
}
