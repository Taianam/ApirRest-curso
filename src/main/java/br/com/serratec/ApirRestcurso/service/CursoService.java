package br.com.serratec.ApirRestcurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.ApirRestcurso.exception.ResourceBadRequestException;
import br.com.serratec.ApirRestcurso.exception.ResourceNotFoundException;
import br.com.serratec.ApirRestcurso.model.Curso;
import br.com.serratec.ApirRestcurso.repository.CursoRepository;



@Service
public class CursoService {
	
	@Autowired
	CursoRepository _cursoRepository;
	
	public List<Curso> obter(){
		return this._cursoRepository.findAll();
	}
	
	public Optional<Curso> obter(Long id) {
		verificarSecursoExiste(id);
		return this._cursoRepository.findById(id);
	}
	
	public Curso adicionar(Curso curso) {
		curso.setId(null);
		verificarSecursoEValido(curso);
		return this._cursoRepository.save(curso);
	}
	
	private void verificarSecursoExiste(Long id) {
		Optional<Curso> curso = this._cursoRepository.findById(id);
		
		if (curso.isEmpty()) {
			throw new ResourceNotFoundException("Id não cadastrado!");
		}
	}
	
	private void verificarSecursoEValido(Curso curso) {
		if(curso.getDescricao() == null || curso.getDescricao() == "" || curso.getAlunos() == null || curso.getModulos() == null) {
			throw new ResourceBadRequestException("O campo nome são obrigatórios!");
		}
	}
}
