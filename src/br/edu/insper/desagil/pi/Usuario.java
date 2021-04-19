package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public Video postaVideo(int id, Produto produto) {
		Video video = null;
		video = new Video(id, produto, video);
		videos.add(video);
		return video;
	}
	
	public int totalAvaliacoes() {
		soma += this.avaliacoes;
		return soma;
	}

	public String getNome() {
		return nome;
	}
}
