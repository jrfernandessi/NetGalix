package br.com.netgalix.dao;

import java.sql.SQLException;

import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.Grupo;

public class GrupoDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	public GrupoDAO(){
		 //this.conexao = new ConnectionFactory();
	     //this.session = conexao.getSession();
	}
	public void inserir(Grupo g) throws SQLException{
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(g);
		session.getTransaction().commit();
		session.close();
		session = conexao.getSession();
		
	}
	public void delete(Grupo g) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(g);
		session.getTransaction().commit();
		session.close();
		session = conexao.getSession();
	
	}
	public Grupo procurar(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (Grupo) this.session.get(Grupo.class, id);
	}
	public void atualiza(Grupo g) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(g);
		session.getTransaction().commit();
		session.close();
		session = conexao.getSession();
	
	}
}
