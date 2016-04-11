package br.com.guabiraba.tcc.teste;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.guabiraba.tcc.model.Candlestick;
import br.com.guabiraba.tcc.model.CandlestickFactory;
import br.com.guabiraba.tcc.model.Negociacao;

public class TestaCandlestickFactory {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		Negociacao negociacao1 = new Negociacao(4, 100, hoje);
		Negociacao negociacao2 = new Negociacao(3, 100, hoje);
		Negociacao negociacao3 = new Negociacao(2, 100, hoje);
		Negociacao negociacao4 = new Negociacao(0, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
		
		System.out.println(candle.getAbertura());
		System.out.println(candle.getFechamento());
		System.out.println(candle.getMinimo());
		System.out.println(candle.getMaximo());
		System.out.println(candle.getVolume());
		
		
	}
}
