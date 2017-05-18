package br.com.netgalix.bean;


import br.com.netgalix.business.PerfilBusiness;
import br.com.netgalix.entidades.Perfil;
import br.com.netgalix.entidades.Usuario;
import br.com.netgalix.util.UtilNetgalix;
import java.util.Date;
import java.util.List;


public class PerfilBean {

	private Usuario usuario;
	private Usuario usuarioTemp = null;
	private String dataTemp;
	private String senhaTemp;
	private Perfil perfil;
	private PerfilBusiness perfilBusiness;
	private UsuarioBean usuarioBean;
	private String mensagem = "";
	private String mensagemInicial;
	private String mensagemInicial_2;
	
	public PerfilBean(){
		this.usuario = new Usuario();
		this.perfil = new Perfil();
		this.perfilBusiness = new PerfilBusiness();
		this.usuarioBean = new UsuarioBean();
		
	}
	
	public String getMensagemInicial_2() {
		return mensagemInicial_2;
	}

	public void setMensagemInicial_2(String mensagemInicial_2) {
		this.mensagemInicial_2 = mensagemInicial_2;
	}

	public String getMensagemInicial() {
		return mensagemInicial;
	}

	public void setMensagemInicial(String mensagemInicial) {
		this.mensagemInicial = mensagemInicial;
	}
	
	public Usuario getUsuarioTemp() {
		return usuarioTemp;
	}

	public void setUsuarioTemp(Usuario usuarioTemp) {
		this.usuarioTemp = usuarioTemp;
	}
	
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public PerfilBusiness getPerfilBusiness() {
		return perfilBusiness;
	}

	public void setPerfilBusiness(PerfilBusiness perfilBusiness) {
		this.perfilBusiness = perfilBusiness;
	}


	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public String getDataTemp() {
		return dataTemp;
	}
	public void setDataTemp(String dataTemp) {
		this.dataTemp = dataTemp;
	}
	
	public String getSenhaTemp() {
		return senhaTemp;
	}
	public void setSenhaTemp(String senhaTemp) {
		this.senhaTemp = senhaTemp;
	}
	public String preencheFormulario(){
		this.mensagem = "";
		if(usuarioBean.procurarUsuario(usuario)){
			
			return "formulario";
	    }else{
		   this.mensagem = "Esse E-mail já existe!";
		   return "cadastroCliente";
	    }
		
	}
	
	public String salvarPerfil(){
		if(usuario.getSenha_usuario().equals(senhaTemp)){
			if(UtilNetgalix.validaData(dataTemp)){
				
				    //Inserir Usuario
					  usuario.setData_nasc_usuario(UtilNetgalix.treatToDate(dataTemp));
					  //System.out.println(usuario.getId());
					  if(usuarioBean.salvarUsuario(usuario)){
					       
						//Inserir Perfil
							Date data = UtilNetgalix.pegarDataAtual();
							
							this.perfil.setStatus_perfil(true);
							this.perfil.setData_criacao(data); 
							this.perfil.setId_usuario(usuario.getId());
							this.perfil.setId_papel(1L);
							if(perfilBusiness.adicionarPerfil(perfil)){
								this.mensagem = "Seu cadastro foi realizado com sucesso!";
								if(usuario.getSexo_usuario().equals("Masculino")){
								     this.mensagem = "Bem Vindo Senhor "+usuario.getApelido_usuario();
								     this.mensagemInicial_2 = "Bem Vindo Senhor";
								     this.mensagemInicial = usuario.getApelido_usuario()+"!";
								  
								}else{
									this.mensagem = "Bem Vinda Senhora "+usuario.getApelido_usuario();
									this.mensagemInicial_2 = "Bem Vinda Senhora";
								    this.mensagemInicial = usuario.getApelido_usuario()+"!";
								   
								}
								
								this.usuario = new Usuario();
								this.dataTemp = "";
								this.senhaTemp = "";
								
								return "sucesso";	
							}else{
								this.mensagem = "Erro no seu cadastro!";
								return "erro";
							}
					  }else{
						  this.mensagem = "Erro no seu cadastro!";
							return "erro";
					  }
					
					
			}else{
				this.mensagem = "Digite a data no formato que se pede!";
				return "formulario";
			}
			
		}else{
			this.mensagem = "A senha não confere com a senha de confirmação!";
			return "formulario";
		}
	}
	public String loginPerfil(){
		this.usuarioBean = new UsuarioBean();
		if(usuarioBean.loginUsuario(usuario.getEmail_usuario(), usuario.getSenha_usuario()) == false){
			List<Usuario> usuarioList = usuarioBean.getUsuarioBusiness().procurarUsuario(usuario);
			this.usuarioTemp = new Usuario();
			this.usuarioTemp = usuarioList.get(0);
			this.usuario = new Usuario();
			if(usuarioTemp.getSexo_usuario().equals("Masculino")){
			     this.mensagem = "Bem Vindo Senhor "+usuarioTemp.getApelido_usuario();
			     this.mensagemInicial_2 = "Bem Vindo Senhor";
			     this.mensagemInicial = usuarioTemp.getApelido_usuario()+"!";
			     return "boasVindas";
			}else{
				this.mensagem = "Bem Vinda Senhora "+usuarioTemp.getApelido_usuario();
				this.mensagemInicial_2 = "Bem Vinda Senhora";
			    this.mensagemInicial = usuarioTemp.getApelido_usuario()+"!";
			     return "boasVindas";
			}
			
		}else{
			this.mensagem = "Usuario Não Encontrado";
			return "cadastroCliente";
		}
	}
	
	public String zerarMensagem(){
		this.mensagem = "";
		return "redirecionarCadastro";
	}
	
}
