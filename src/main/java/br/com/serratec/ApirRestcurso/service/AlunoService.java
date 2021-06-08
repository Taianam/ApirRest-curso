package br.com.serratec.ApirRestcurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.serratec.ApirRestcurso.model.Aluno;
import br.com.serratec.ApirRestcurso.repository.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository _alunoRepository;

    public List<Aluno> obterTodos(){

        return this._alunoRepository.findAll();
    }

    public Aluno adicionar(Aluno aluno){
        aluno.setId(null);

        return null;
    }

}
