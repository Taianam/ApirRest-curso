package br.com.serratec.ApirRestcurso.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.ApirRestcurso.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
    Optional<Aluno> findById(Long id);
}
