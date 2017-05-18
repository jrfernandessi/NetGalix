package br.com.netgalix.bean;

import javax.swing.JOptionPane;

import br.com.netgalix.business.GrupoBusiness;
import br.com.netgalix.entidades.Grupo;

public class GrupoBean {
	
	private Grupo grupo;
	private GrupoBusiness grupoBusiness;
	
	public GrupoBean(){
		this.grupo = new Grupo();
		this.grupoBusiness = new GrupoBusiness();
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public GrupoBusiness getGrupoBusiness() {
		return grupoBusiness;
	}

	public void setGrupoBusiness(GrupoBusiness grupoBusiness) {
		this.grupoBusiness = grupoBusiness;
	}
	
	public String salvarGrupo(){
		this.grupo.setStatus_grupo(true);
		if(grupoBusiness.adicionarGrupo(grupo)){
			JOptionPane.showMessageDialog(null,"Grupo inserido com sucesso");        
			return "certo";	
		}else{
			JOptionPane.showMessageDialog(null,"Erro ao inserir grupo");
			return "index";
		}
		
	}
	public String deletarGrupo(){
		if(grupoBusiness.deletarGrupo(grupo)){
			JOptionPane.showMessageDialog(null,"Grupo deletado com sucesso");
			return "certo";
		}else{
			JOptionPane.showMessageDialog(null,"Erro ao deletar grupo");
			return "index";
		}
	}
	public String procurarGrupo(){
		this.grupo = grupoBusiness.procurarGrupo(grupo);
		if(grupo == null){
			JOptionPane.showMessageDialog(null,"Grupo não encontrado");
			return "index";
		}else{
			return "certo";
		}
	}
	public String atualizarGrupo(){
		if(grupoBusiness.atualizarGrupo(grupo)){
			JOptionPane.showMessageDialog(null,"Grupo atualizado com sucesso");
			return "certo";
		}else{
			JOptionPane.showMessageDialog(null,"Erro ao atualizar grupo");
			return "index";
		}
	}

}
