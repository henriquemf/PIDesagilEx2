package br.edu.insper.desagil.pi;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<Usuario, Integer> avaliacoes;
	
	public Video(int id) {
		this.id = id;
		this.avaliacoes = new HashMap<>();
	}
	
	public void adicionaAvaliacao(Usuario usuario, int id) {
		if (this.avaliacoes.get(id) <= 5 && this.avaliacoes.get(id) >= 1) {
			this.avaliacoes.put(usuario, id);
		}
	}
	
	public void mediaAvaliacoes() {
		if (this.avaliacoes > 0.5);
	}
	
	public Produto getProduto() {
		return produto;
	}

	public int getId() {
		return id;
	}
}
