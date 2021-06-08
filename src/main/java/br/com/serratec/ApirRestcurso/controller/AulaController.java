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

import br.com.serratec.ApirRestcurso.model.Aula;
import br.com.serratec.ApirRestcurso.service.AulaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "API para aulas")
@RestController
@RequestMapping(value = "api/aulas")
public class AulaController {

	@Autowired
	AulaService _aulaService;
	
	@ApiOperation(value = "Obtem todas as aulas")
	@GetMapping
	public List<Aula> obter(){
		return this._aulaService.obter();
	}
	
	@ApiOperation(value = "Obtem uma aula po ID")
	@GetMapping(value = "/{id}")
	public Optional<Aula> obter(@PathVariable(value = "id")Long id) {
		return this._aulaService.obter(id);
	}
	
	@ApiOperation(value = "Adiciona uma nova aula")
	@PostMapping
	public Aula obter(@RequestBody Aula aula) {
		return this._aulaService.adicionar(aula);
	}
}
