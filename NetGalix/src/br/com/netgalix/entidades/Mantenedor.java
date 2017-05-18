package br.com.netgalix.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="mantenedor", schema="comercio")
public class Mantenedor {
	@Id 
	@SequenceGenerator(name = "SEQ_MANTENEDOR",sequenceName = " comercio.mantemedor_sequence")
	@GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "SEQ_MANTENEDOR")  
	
	private long idProduto;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}
	
}
