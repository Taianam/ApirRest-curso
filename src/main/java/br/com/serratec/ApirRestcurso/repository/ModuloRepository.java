package br.com.serratec.ApirRestcurso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.ApirRestcurso.model.Modulo;

public interface ModuloRepository extends JpaRepository<Modulo, Long>{

	Optional<Modulo> findById(Long id);
}
