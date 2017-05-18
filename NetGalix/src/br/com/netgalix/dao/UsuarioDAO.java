package br.com.netgalix.dao;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import br.com.netgalix.config.ConnectionFactory;
import br.com.netgalix.entidades.Usuario;
import org.hibernate.Query;

public class UsuarioDAO {

	private ConnectionFactory conexao;
    private Session session;
	
	public UsuarioDAO(){
		//this.conexao = new ConnectionFactory();
	    //this.session = conexao.getSession();
	}
	public void inserir(Usuario u) throws SQLException{
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
	    session.beginTransaction();
		this.session.save(u);
		session.getTransaction().commit();
		session.close();
		
	}
	public void delete(Usuario u) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.delete(u);
		session.getTransaction().commit();
		session.close();
	
	}
	public Usuario procurarPorId(Long id) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
	    return (Usuario) this.session.get(Usuario.class, id);
	    //Esse comando pegar um cara por qualquer campo?
	    //return (Usuario) this.session.load(Usuario.class, ""+busca);
	    
	    //nao é preciso informar o nome do jeito q ta banco - testar
	    //query = session.createQuery("FROM Login log WHERE log.nome like'%"+login.getNome()+"%'");
	}
	public List<Usuario> procuraPorEmail(String busca){
		//testar esse codigo
		//session.beginTransaction();
		//String hql="from Usuario where email_usuario='"+busca+"';"
		//Query query = session.createQuery(hql);
		//Usuario u =(Usuario)query.uniqueResult();
		//session.getTransaction().commit();
		//session.close();
		//return u;
		
		this.conexao = new ConnectionFactory();
		this.session = conexao.getSession();
        return (List<Usuario>) this.session.createCriteria(Usuario.class).add(Restrictions.ilike("email_usuario", "%"+busca+"%")).addOrder(Order.asc("email_usuario")).list();
		
    }
	public void atualiza(Usuario u) {
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
		session.beginTransaction();
		this.session.update(u);
		session.getTransaction().commit();
		session.close();
	
	}
	
	public boolean login(String login, String senha){
		this.conexao = new ConnectionFactory();
	    this.session = conexao.getSession();
        Query query = this.session.createQuery("from Usuario where email_usuario = :login and senha_usuario = :senha");
        query.setString("login", login);
        query.setString("senha", senha);
        return query.list().isEmpty();
    }

}
