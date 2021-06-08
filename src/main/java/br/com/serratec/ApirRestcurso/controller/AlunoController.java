package br.com.serratec.ApirRestcurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.serratec.ApirRestcurso.model.Aluno;
import br.com.serratec.ApirRestcurso.service.AlunoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@Api
@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    
    @Autowired
    AlunoService _alunoService;

    @ApiOperation("Método para visualizar todos os alunos")
    @GetMapping
    public List<Aluno> obterTodos() throws Exception{
        return _alunoService.obterTodos();
    }

    @ApiOperation("Método para adicionar novo aluno")
    @PostMapping
    public Aluno adicionar(@RequestBody Aluno aluno){
        return _alunoService.adicionar(aluno);
    }
}
