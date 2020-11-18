package br.jus.tjrj.integracaoSiscondj.soap;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.jus.tjrj.integracaoSiscondj.model.ProcessoModel;
import br.jus.tjrj.integracaoSiscondj.service.ProcessoService;
import br.jus.tjrj.integracaosiscondj.soap.processo.Processo;
import br.jus.tjrj.integracaosiscondj.soap.processo.RetornarProcessoPorNumeroRequest;
import br.jus.tjrj.integracaosiscondj.soap.processo.RetornarProcessoPorNumeroResponse;

@Endpoint
public class ProcessoEndpoint {
	
	ProcessoService processoService = new ProcessoService();
	
	@PayloadRoot(namespace="processo.soap.integracaoSiscondj.tjrj.jus.br", localPart="retornarProcessoPorNumeroRequest")
	@ResponsePayload
	public RetornarProcessoPorNumeroResponse retornarProcessoPorNumeroResponse
	(@RequestPayload RetornarProcessoPorNumeroRequest req) throws Exception {
		
		ProcessoModel processoModel;
		processoModel = processoService.findByNumeroProcesso(req.getNumeroProcesso());
		
		if(processoModel == null)
			throw new Exception("Processo nao encontrado");
				
		return convertToProcessoResponse(processoModel);
	}

	private RetornarProcessoPorNumeroResponse convertToProcessoResponse(ProcessoModel processoModel) {
		RetornarProcessoPorNumeroResponse processoResponse = new RetornarProcessoPorNumeroResponse();
		processoResponse.setProcessos(convertToProcesso(processoModel));
		
		return processoResponse;
	}

	private Processo convertToProcesso(ProcessoModel processoModel) {
		Processo processo = new Processo();
		processo.setNumeroProcessoCNJ(processoModel.getNumeroProcessoCNJ());
		
		return processo;		
	}

}
