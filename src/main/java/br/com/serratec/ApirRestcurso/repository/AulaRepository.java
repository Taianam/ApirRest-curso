package br.com.serratec.ApirRestcurso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.ApirRestcurso.model.Aula;

public interface AulaRepository extends JpaRepository<Aula, Long>{

	Optional<Aula> findById(Long id);
}
