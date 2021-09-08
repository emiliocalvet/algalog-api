package io.github.emiliocalvet.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.github.emiliocalvet.domain.model.Entrega;
import io.github.emiliocalvet.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	private EntregaRepository entregaRepository;
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		entrega.finalizar();
		entregaRepository.save(entrega);
	}
}
