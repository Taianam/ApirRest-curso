package br.com.serratec.ApirRestcurso.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modulo")
public class Modulo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String descricao;
	private List<Aula> listaDeAulas;

	public Modulo() {
	}

	public Modulo(String descricao, List<Aula> listaDeAulas) {
		this.descricao = descricao;
		this.listaDeAulas = listaDeAulas;
	}

	public Modulo(Long id, String descricao, List<Aula> listaDeAulas) {
		this.id = id;
		this.descricao = descricao;
		this.listaDeAulas = listaDeAulas;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<Aula> getListaDeAulas() {
		return listaDeAulas;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setListaDeAulas(List<Aula> listaDeAulas) {
		this.listaDeAulas = listaDeAulas;
	}

}
