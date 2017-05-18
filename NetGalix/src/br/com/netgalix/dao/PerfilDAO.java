package br.com.netgalix.dao;

import java.sql.SQLException;
import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;

import br.com.netgalix.entidades.Perfil;

public class PerfilDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	
	public PerfilDAO(){
		//this.conexao = new ConnectionFactory();
	    //this.session = conexao.getSession();
	}
	public void inserir(Perfil p) throws SQLException{
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(Perfil p) {
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(p);
		session.getTransaction().commit();
		session.close();
	
	}
	public Perfil procurar(Long id) {
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
	    return (Perfil) this.session.get(Perfil.class, id);
	}
	public void atualiza(Perfil p) {
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(p);
		session.getTransaction().commit();
		session.close();
	
	}
}
