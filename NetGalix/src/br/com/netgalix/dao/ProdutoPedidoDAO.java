package br.com.netgalix.dao;

import java.sql.SQLException;
import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.Pedido;
import br.com.netgalix.entidades.ProdutoPedido;
public class ProdutoPedidoDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	public ProdutoPedidoDAO(){
		//this.conexao = new ConnectionFactory();
	    //this.session = conexao.getSession();
	}
	public void inserir(ProdutoPedido p) throws SQLException{
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(ProdutoPedido p) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(p);
		session.getTransaction().commit();
		session.close();
	
	}
	public ProdutoPedido procurar(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (ProdutoPedido) this.session.get(ProdutoPedido.class, id);
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
