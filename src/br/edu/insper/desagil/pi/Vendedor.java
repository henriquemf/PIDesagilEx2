package br.edu.insper.desagil.pi;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
	private List<Produto> produtos;
	
	public Vendedor(String nome) {
		super(nome);
		this.produtos = new ArrayList<>();
	}
	
	public void cadastraProduto (double preco, String nome) {
		Produto produto = null;
		produto = new Produto(nome, preco);
		this.produtos.add(produto);
	}
}
