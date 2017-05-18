package br.com.netgalix.business;

import java.sql.SQLException;
import br.com.netgalix.dao.UsuarioDAO;
import br.com.netgalix.entidades.Usuario;
import java.util.List;

public class UsuarioBusiness {

    private UsuarioDAO usuarioDAO;
	
	public UsuarioBusiness(){
		this.usuarioDAO = new UsuarioDAO();
	}
	public boolean adicionarUsuario(Usuario usuario) {
        try {
        	usuarioDAO.inserir(usuario);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
	
	public List<Usuario> procurarUsuario(Usuario usuario){
    	List<Usuario> g = usuarioDAO.procuraPorEmail(usuario.getEmail_usuario());
    	return g;
    }
	public boolean fazerLogin(String email, String senha){
		return usuarioDAO.login(email, senha);
	}
}
