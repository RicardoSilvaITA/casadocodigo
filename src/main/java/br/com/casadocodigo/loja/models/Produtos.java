package br.com.casadocodigo.loja.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Produtos {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String descricao;
	private int paginas;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public String toString() {
		return "Produtos [titulo=" + titulo + ", descricao=" + descricao + ", paginas=" + paginas + "]";
	}
	

}
