package br.com.netgalix.entidades;

import java.util.ArrayList;
import br.com.netgalix.entidades.Pedido;

public class Cliente extends Perfil{

	    private ArrayList<Pedido> pedidos;
         
	    public Cliente() {
	    this.pedidos = new ArrayList<Pedido>();
	    }

	    public ArrayList<Pedido> getPedidos() {
	        return pedidos;
	    }

	    public void setInscricoes(ArrayList<Pedido> pedidos) {
	        this.pedidos = pedidos;
	    }
}
