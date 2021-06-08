package br.com.serratec.ApirRestcurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.ApirRestcurso.exception.ResourceBadRequestException;
import br.com.serratec.ApirRestcurso.exception.ResourceNotFoundException;
import br.com.serratec.ApirRestcurso.model.Aula;
import br.com.serratec.ApirRestcurso.repository.AulaRepository;

@Service
public class AulaService {

	@Autowired
	AulaRepository _aulaRepository;

	public List<Aula> obter() {
		return this._aulaRepository.findAll();
	}

	public Optional<Aula> obter(Long id) {
		verificarSeAulaExiste(id);
		return this._aulaRepository.findById(id);
	}

	public Aula adicionar(Aula aula) {
		verificarSeAulaEValida(aula);
		return this._aulaRepository.save(aula);
	}

	private void verificarSeAulaExiste(Long id) {
		Optional<Aula> aula = this._aulaRepository.findById(id);

		if (aula.isEmpty()) {
			throw new ResourceNotFoundException();
		}
	}

	private void verificarSeAulaEValida(Aula aula) {
		if (aula.getDescricao() == null || aula.getCargaHoraria() == "" || aula.getCargaHoraria() == null
				|| aula.getCargaHoraria() == "") {
			throw new ResourceBadRequestException();
		}
	}

}
