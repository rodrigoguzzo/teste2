package br.jus.tjrj.integracaoSiscondj.soap;

import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.jus.tjrj.integracaoSiscondj.model.ComarcaModel;
import br.jus.tjrj.integracaoSiscondj.service.ComarcaService;
import br.jus.tjrj.integracaosiscondj.soap.comarca.Comarca;
import br.jus.tjrj.integracaosiscondj.soap.comarca.RetornarTodasComarcasRequest;
import br.jus.tjrj.integracaosiscondj.soap.comarca.RetornarTodasComarcasResponse;


public class ComarcaEndpoint {
	
	ComarcaService comarcaService;
	
	@PayloadRoot(namespace="comarca.soap.integracaoSiscondj.tjrj.jus.br", localPart="retornarTodasComarcasRequest")
	@ResponsePayload
	public RetornarTodasComarcasResponse retornarTodasComarcasResponse
	(@RequestPayload RetornarTodasComarcasRequest req) throws Exception {
		
		RetornarTodasComarcasResponse response = new RetornarTodasComarcasResponse();
				
		for (ComarcaModel c : comarcaService.getComarcas()) {
			response.getListaComarcas().add(convertToComarcaResponse(c));
		}
		
		return response;
	}

	private Comarca convertToComarcaResponse(ComarcaModel comarcaModel) {
		
		Comarca comarca = new Comarca();
		comarca.setCodigo(comarcaModel.getCodigo());
		comarca.setInstancia(comarcaModel.getInstancia());
		comarca.setNome(comarcaModel.getNome());
		
		return comarca;
	}

}
