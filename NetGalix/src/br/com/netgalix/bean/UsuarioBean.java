package br.com.netgalix.bean;

import java.util.List;
import br.com.netgalix.business.UsuarioBusiness;
import br.com.netgalix.entidades.Usuario;

public class UsuarioBean {

	private UsuarioBusiness usuarioBusiness;
	private Usuario usuario;

	public UsuarioBean() {
		this.usuarioBusiness = new UsuarioBusiness();
		this.usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioBusiness getUsuarioBusiness() {
		return usuarioBusiness;
	}

	public void setUsuarioBusiness(UsuarioBusiness usuarioBusiness) {
		this.usuarioBusiness = usuarioBusiness;
	}

	public boolean salvarUsuario(Usuario usuario) {
		if (usuarioBusiness.adicionarUsuario(usuario)) {
			return true;
		} else {

			return false;
		}

	}

	public boolean procurarUsuario(Usuario u) {
		List<Usuario> us = usuarioBusiness.procurarUsuario(u);
		return us.isEmpty();

	}

	public boolean loginUsuario(String email, String senha) {
		return usuarioBusiness.fazerLogin(email, senha);
	}

}
