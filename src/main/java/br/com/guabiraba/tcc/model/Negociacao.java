package br.com.guabiraba.tcc.model;

import java.util.Calendar;

import com.thoughtworks.xstream.annotations.XStreamAlias;



public final class Negociacao {

	private final double preco;
	private final int quantidade;
	private final Calendar data;

	public Negociacao(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Calendar getData() {
		return data;
	}

	public double getVolume() {
		return preco * quantidade;
	}
}
