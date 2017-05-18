package br.com.netgalix.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="usuario", schema="comercio")
public class Usuario {

	@Id 
	@SequenceGenerator(name = "SEQ_USUARIO",sequenceName = " comercio.usuario_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_USUARIO")  
	private Long id;
	private String nome_usuario;
	private String rua_usuario;
	private String bairro_usuario;
	private String numero_casa_usuario;
	private String cidade_usuario;
	private String sexo_usuario;
	private String cep_usuario;
	private String uf_usuario;
	private String cpf_usuario;
	private String telefone_usuario;
	private Date data_nasc_usuario;
	private String senha_usuario;
	private String email_usuario;
	private String apelido_usuario;
	
	
	public String getApelido_usuario() {
		return apelido_usuario;
	}
	public void setApelido_usuario(String apelido_usuario) {
		this.apelido_usuario = apelido_usuario;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getRua_usuario() {
		return rua_usuario;
	}
	public void setRua_usuario(String rua_usuario) {
		this.rua_usuario = rua_usuario;
	}
	public String getBairro_usuario() {
		return bairro_usuario;
	}
	public void setBairro_usuario(String bairro_usuario) {
		this.bairro_usuario = bairro_usuario;
	}
	public String getNumero_casa_usuario() {
		return numero_casa_usuario;
	}
	public void setNumero_casa_usuario(String numero_casa_usuario) {
		this.numero_casa_usuario = numero_casa_usuario;
	}
	public String getCidade_usuario() {
		return cidade_usuario;
	}
	public void setCidade_usuario(String cidade_usuario) {
		this.cidade_usuario = cidade_usuario;
	}
	public String getSexo_usuario() {
		return sexo_usuario;
	}
	public void setSexo_usuario(String sexo_usuario) {
		this.sexo_usuario = sexo_usuario;
	}
	public String getCep_usuario() {
		return cep_usuario;
	}
	public void setCep_usuario(String cep_usuario) {
		this.cep_usuario = cep_usuario;
	}
	public String getUf_usuario() {
		return uf_usuario;
	}
	public void setUf_usuario(String uf_usuario) {
		this.uf_usuario = uf_usuario;
	}
	public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	
	public String getTelefone_usuario() {
		return telefone_usuario;
	}
	public void setTelefone_usuario(String telefone_usuario) {
		this.telefone_usuario = telefone_usuario;
	}
	public Date getData_nasc_usuario() {
		return data_nasc_usuario;
	}
	public void setData_nasc_usuario(Date data_nasc_usuario) {
		this.data_nasc_usuario = data_nasc_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
}
