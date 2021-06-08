package br.com.serratec.ApirRestcurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.ApirRestcurso.exception.ResourceBadRequestException;
import br.com.serratec.ApirRestcurso.exception.ResourceNotFoundException;
import br.com.serratec.ApirRestcurso.model.Modulo;
import br.com.serratec.ApirRestcurso.repository.ModuloRepository;

@Service
public class ModuloService {

	@Autowired
	ModuloRepository _moduloRepository;
	
	public List<Modulo> obter(){
		return this._moduloRepository.findAll();
	}
	
	public Optional<Modulo> obter(Long id) {
		verificarSeModuloExiste(id);
		return this._moduloRepository.findById(id);
	}
	
	public Modulo adicionar(Modulo modulo) {
		verificarSeModuloEValido(modulo);
		return this._moduloRepository.save(modulo);
	}
	
	private void verificarSeModuloExiste(Long id) {
		Optional<Modulo> modulo = this._moduloRepository.findById(id);
		
		if (modulo.isEmpty()) {
			throw new ResourceNotFoundException();
		}
	}
	
	private void verificarSeModuloEValido(Modulo modulo) {
		if(modulo.getDescricao() == null || modulo.getDescricao() == "" || modulo.getListaDeAulas() == null) {
			throw new ResourceBadRequestException();
		}
	}
}
