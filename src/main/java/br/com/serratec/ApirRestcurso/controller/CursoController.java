package br.com.serratec.ApirRestcurso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.serratec.ApirRestcurso.model.Curso;
import br.com.serratec.ApirRestcurso.service.CursoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Api(value = "Api para Cursos")
@RestController
@RequestMapping(value = "/api/cursos")
public class CursoController {
	
	@Autowired
	CursoService _cursoService;
	
	@ApiOperation("Método para visualizar todos os cursos")
	@GetMapping
	public List<Curso> obter(){
		return this._cursoService.obter();
	}
	
//	@ApiOperation("Método para visualizar um curso atráves do id")
//	@GetMapping
//	public Optional<Curso> obter(Long id) {
//		return this._cursoService.obter(id);
//	}
	
	@ApiOperation("Método para adicionar novo curso")
	@PostMapping
	public Curso adicionar(@RequestBody Curso curso) {
		return this._cursoService.adicionar(curso);
	}
}
