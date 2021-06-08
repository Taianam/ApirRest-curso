package br.com.serratec.ApirRestcurso.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aula")
public class Aula {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String descricao;

	private String cargaHoraria;
	
	@ManyToOne
	@JoinColumn(name="modulo_id")
	private Modulo modulo;

	public Aula() {
	}
	

	public Aula(Long id, String descricao, String cargaHoraria) {
		this.id = id;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Aula( String descricao, String cargaHoraria) {
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}


	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
