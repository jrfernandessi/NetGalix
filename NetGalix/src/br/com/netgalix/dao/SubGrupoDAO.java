package br.com.netgalix.dao;

import java.sql.SQLException;
import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.SubGrupo;

public class SubGrupoDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	public SubGrupoDAO(){
		//this.conexao = new ConnectionFactory();
	    //this.session = conexao.getSession();
	}
	public void inserir(SubGrupo s) throws SQLException{
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(s);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(SubGrupo s) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(s);
		session.getTransaction().commit();
		session.close();
	
	}
	public SubGrupo procurar(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (SubGrupo) this.session.get(SubGrupo.class, id);
	}
	public void atualiza(SubGrupo s) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(s);
		session.getTransaction().commit();
		session.close();
	
	}
}
