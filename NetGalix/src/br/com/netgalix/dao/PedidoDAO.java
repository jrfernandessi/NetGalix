package br.com.netgalix.dao;

import java.sql.SQLException;
import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.Pedido;

public class PedidoDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	public PedidoDAO(){
		//this.conexao = new ConnectionFactory();
	     //this.session = conexao.getSession();
	}
	public void inserir(Pedido p) throws SQLException{
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(Pedido p) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(p);
		session.getTransaction().commit();
		session.close();
	
	}
	public Pedido procurar(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (Pedido) this.session.get(Pedido.class, id);
	}
	public void atualiza(Pedido p) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(p);
		session.getTransaction().commit();
		session.close();
	
	}
}
