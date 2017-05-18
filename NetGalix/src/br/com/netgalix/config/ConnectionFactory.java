package br.com.netgalix.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.netgalix.entidades.Fornecedor;
import br.com.netgalix.entidades.Grupo;
import br.com.netgalix.entidades.Pedido;
import br.com.netgalix.entidades.Perfil;
import br.com.netgalix.entidades.Produto;
import br.com.netgalix.entidades.ProdutoPedido;
import br.com.netgalix.entidades.SubGrupo;
import br.com.netgalix.entidades.Usuario;

public class ConnectionFactory {

	private static SessionFactory factory;
	static {
		//cria uma configuracao
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.addAnnotatedClass(Usuario.class);
		cfg.addAnnotatedClass(Perfil.class);
		cfg.addAnnotatedClass(Produto.class);
		cfg.addAnnotatedClass(Fornecedor.class);
		cfg.addAnnotatedClass(Grupo.class);
		cfg.addAnnotatedClass(Pedido.class);
		cfg.addAnnotatedClass(ProdutoPedido.class);
		cfg.addAnnotatedClass(SubGrupo.class);
		//Lê o hibernate.cfg.xml
		cfg.configure();
		factory = cfg.buildSessionFactory();
	
	}
	public Session getSession() {
	return factory.openSession();
   }
}
