package br.com.serratec.ApirRestcurso.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String descricao;
	
	@OneToMany(mappedBy = "curso")
	private List<Modulo> modulos;
	
	@OneToMany(mappedBy = "curso")
	private List<Aluno> Alunos;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	public List<Aluno> getAlunos() {
		return Alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		Alunos = alunos;
	}
}
