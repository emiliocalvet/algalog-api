package io.github.emiliocalvet.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.emiliocalvet.domain.model.Ocorrencia;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {

}
