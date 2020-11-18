package br.jus.tjrj.integracaoSiscondj.service;

import br.jus.tjrj.integracaoSiscondj.model.ProcessoModel;

public class ProcessoService {
	
	public ProcessoModel findByNumeroProcesso(String numProceso) {		
		
		ProcessoModel p = new ProcessoModel();
		p.setNumeroProcessoCNJ("54654856266");
		//repository
		return p;
	}

	
}
