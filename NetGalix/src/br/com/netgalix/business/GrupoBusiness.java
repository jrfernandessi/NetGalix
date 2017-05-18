package br.com.netgalix.business;

import java.sql.SQLException;
import br.com.netgalix.dao.GrupoDAO;
import br.com.netgalix.entidades.Grupo;

public class GrupoBusiness {

	private GrupoDAO grupoDAO;
	
	public GrupoBusiness() {
		grupoDAO = new GrupoDAO();
    }
    public boolean adicionarGrupo(Grupo grupo) {
        try {
        	grupoDAO.inserir(grupo);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    public boolean deletarGrupo(Grupo grupo){
    	Grupo g = grupoDAO.procurar(grupo.getId());
    	if(g == null){
    		return false;
    	}else{
    		grupoDAO.delete(g);
    		return true;
    	}
    }
    public Grupo procurarGrupo(Grupo grupo){
    	Grupo g = grupoDAO.procurar(grupo.getId());
    	return g;
    }
    public boolean atualizarGrupo(Grupo grupo){
    	Grupo g = grupoDAO.procurar(grupo.getId());
    	if(g == null){
    		return false;
    	}else{
    		grupoDAO.atualiza(g);
    		return true;
    	}  	
    }
}
