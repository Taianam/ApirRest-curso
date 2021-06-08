package br.com.serratec.ApirRestcurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.ApirRestcurso.model.Modulo;
import br.com.serratec.ApirRestcurso.service.ModuloService;

@RestController
@RequestMapping(value = "/api/modulos")
public class ModuloController {

	@Autowired
	ModuloService _moduloService;
	
	@GetMapping
	public List<Modulo> obter(){
		return this._moduloService.obter();
	}
	
	@GetMapping
	public Optional<Modulo> obter(Long id) {
		return this._moduloService.obter(id);
	}
	
	@PostMapping
	public Modulo adicionar(@RequestBody Modulo modulo) {
		return this._moduloService.adicionar(modulo);
	}
}
