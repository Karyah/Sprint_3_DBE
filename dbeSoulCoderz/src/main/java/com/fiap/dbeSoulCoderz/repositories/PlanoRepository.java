package com.fiap.dbeSoulCoderz.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fiap.dbeSoulCoderz.model.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long>{
	Page<Plano> findAllByDisponivelTrue(Pageable paginacao);
}
