package io.github.emiliocalvet.domain.service;

import org.springframework.stereotype.Service;

import io.github.emiliocalvet.domain.exception.EntidadeNaoEncontradaException;
import io.github.emiliocalvet.domain.model.Entrega;
import io.github.emiliocalvet.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
