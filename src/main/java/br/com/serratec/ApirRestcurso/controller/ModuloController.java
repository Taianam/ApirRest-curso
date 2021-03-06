package br.com.serratec.ApirRestcurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.ApirRestcurso.model.Modulo;
import br.com.serratec.ApirRestcurso.service.ModuloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Api para Modulos")
@RestController
@RequestMapping(value = "/api/modulos")
public class ModuloController {

	@Autowired
	ModuloService _moduloService;
	
	@ApiOperation(value = "Obtem todos os modulos")
	@GetMapping
	public List<Modulo> obter(){
		return this._moduloService.obter();
	}
	
	@ApiOperation(value = "Obtem um modulo po ID")
	@GetMapping(value = "/{id}")
	public Optional<Modulo> obter(@PathVariable(value = "id") Long id) {
		return this._moduloService.obter(id);
	}
	
	@ApiOperation(value = "Adiciona um novo modulo")
	@PostMapping
	public Modulo adicionar(@RequestBody Modulo modulo) {
		return this._moduloService.adicionar(modulo);
	}
}
