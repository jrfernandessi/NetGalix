package br.com.netgalix.dao;

import java.sql.SQLException;
import org.hibernate.Session;

import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.Fornecedor;

public class FornecedorDAO {
	
	private ConnectionFactory conexao;
    private Session session;
	
	public FornecedorDAO(){
		//this.conexao = new ConnectionFactory();
	    //this.session = conexao.getSession();
	}
	public void inserir(Fornecedor f) throws SQLException{
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(f);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(Fornecedor f) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(f);
		session.getTransaction().commit();
		session.close();
	
	}
	public Fornecedor procurar(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (Fornecedor) this.session.get(Fornecedor.class, id);
	}
	public void atualiza(Fornecedor f) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(f);
		session.getTransaction().commit();
		session.close();
	
	}

}
