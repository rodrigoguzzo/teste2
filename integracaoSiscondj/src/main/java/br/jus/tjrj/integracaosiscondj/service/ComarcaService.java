package br.jus.tjrj.integracaoSiscondj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.jus.tjrj.integracaoSiscondj.model.ComarcaModel;
import br.jus.tjrj.integracaoSiscondj.repository.ComarcaRepository;

@Service
public class ComarcaService {
	
	@Autowired
	ComarcaRepository comarcaRepository;
	
	public List<ComarcaModel> getComarcas() {
		
		return comarcaRepository.findAll();		
	}
	
	public int getComarcaDCP(int codigoPJE) {
		
		return 1;		
	}
}
