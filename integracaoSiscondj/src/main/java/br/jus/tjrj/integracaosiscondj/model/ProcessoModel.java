package br.jus.tjrj.integracaoSiscondj.model;

import java.util.ArrayList;
import java.util.List;

import br.jus.tjrj.integracaosiscondj.soap.processo.Parte;

public class ProcessoModel {
	
	protected int codigoComarca;
	protected int codigoServentia;
	protected int instancia;
	protected String numeroProcessoCNJ;
	protected String numeroProcessoTribunal;
	protected List<Parte> partes;
	
	
	public int getCodigoComarca() {
		return codigoComarca;
	}


	public void setCodigoComarca(int codigoComarca) {
		this.codigoComarca = codigoComarca;
	}


	public int getCodigoServentia() {
		return codigoServentia;
	}


	public void setCodigoServentia(int codigoServentia) {
		this.codigoServentia = codigoServentia;
	}


	public int getInstancia() {
		return instancia;
	}


	public void setInstancia(int instancia) {
		this.instancia = instancia;
	}


	public String getNumeroProcessoCNJ() {
		return numeroProcessoCNJ;
	}


	public void setNumeroProcessoCNJ(String numeroProcessoCNJ) {
		this.numeroProcessoCNJ = numeroProcessoCNJ;
	}


	public String getNumeroProcessoTribunal() {
		return numeroProcessoTribunal;
	}


	public void setNumeroProcessoTribunal(String numeroProcessoTribunal) {
		this.numeroProcessoTribunal = numeroProcessoTribunal;
	}


	public List<Parte> getPartes() {
		return partes;
	}


	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}


	public ProcessoModel() {
		this.partes = new ArrayList<>();
	}

	
}
