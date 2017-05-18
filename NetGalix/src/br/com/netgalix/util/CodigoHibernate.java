//package br.com.netgalix.util;
//public class CodigoHibernate {
//}
/*
 
 public List<Produto> procura(String busca){
        return (List<Produto>) this.session.createCriteria(Produto.class).add(Restrictions.ilike("nome", "%"+busca+"%")).addOrder(Order.asc("nome")).list();
    }




public List<Compra> procura(Date d){
        Query query = this.session.createQuery("from Compra where data = :d");
        query.setDate("d", d);
        return (List<Compra>) query.list();
}




package br.com.ballum.base.banco.dao;

import br.com.ballum.bean.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class UsuarioDAO {

    private Session session;

    public UsuarioDAO(Session session) {
        this.session = session;
    }

    public void salvar(Usuario p){
        this.session.beginTransaction();
        this.session.save(p);
        this.session.getTransaction().commit();
    }

    public void remove(Usuario p){
        this.session.beginTransaction();
        this.session.delete(p);
        this.session.getTransaction().commit();
    }

    public Usuario procura(int id){
        return (Usuario) this.session.load(Usuario.class, id);
    }

    public void atualiza(Usuario p){
        this.session.beginTransaction();
        this.session.update(p);
        this.session.getTransaction().commit();
    }

    public boolean login(String login, String senha){
        Query query = this.session.createQuery("from Usuario where login = :login and senha = :senha");
        query.setString("login", login);
        query.setString("senha", senha);

        return query.list().isEmpty();
    }

    public Usuario procura(String login, String senha){
        Query query = this.session.createQuery("from Usuario where login = :login and senha = :senha");
        query.setString("login", login);
        query.setString("senha", senha);

        return (Usuario) query.list().get(0);

    }

    public List<Usuario> listarTodos(){
        return this.session.createCriteria(Usuario.class).addOrder(Order.asc("nome")).list();
    }

    public void close(){
        this.session.close();
    }
} 
  
  
  */
