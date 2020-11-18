package br.jus.tjrj.integracaoSiscondj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DCP_HOML.ORGAOJULGADOR")
public class ComarcaModel {
	
	@Id
	@Column(name="COD_ORG")
	private int codigo;
	
	@Column(name="TIP_COMP")
	private int instancia;
	
	@Column(name="NOME")
	private String nome;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getInstancia() {
		return instancia;
	}
	public void setInstancia(int instancia) {
		this.instancia = instancia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
