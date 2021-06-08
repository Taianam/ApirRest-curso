package br.com.serratec.ApirRestcurso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.ApirRestcurso.model.Curso;


public interface CursoRepository extends JpaRepository<Curso, Long>{
    Optional<Curso> findById(Long id);
}

