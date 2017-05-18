package br.com.netgalix.business;

import java.sql.SQLException;

import br.com.netgalix.dao.PerfilDAO;

import br.com.netgalix.entidades.Perfil;

public class PerfilBusiness {

	private PerfilDAO perfilDAO;
	
	public PerfilBusiness(){
		this.perfilDAO = new PerfilDAO();
	}
	public boolean adicionarPerfil(Perfil perfil) {
        try {
        	perfilDAO.inserir(perfil);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean deletarPerfil(Perfil perfil){
    	Perfil p = perfilDAO.procurar(perfil.getId());
    	if(p == null){
    		return false;
    	}else{
    		perfilDAO.delete(p);
    		return true;
    	}
    }
    public Perfil procurarPerfil(Perfil perfil){
    	Perfil p = perfilDAO.procurar(perfil.getId());
    	return p;
    }
    public boolean atualizarPerfil(Perfil perfil){
    	Perfil p = perfilDAO.procurar(perfil.getId());
    	if(p == null){
    		return false;
    	}else{
    		perfilDAO.atualiza(p);
    		return true;
    	}  	
    }
	
}
