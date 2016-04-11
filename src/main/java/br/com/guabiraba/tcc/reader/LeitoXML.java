package br.com.guabiraba.tcc.reader;

import java.io.InputStream;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.guabiraba.tcc.model.Negociacao;

public class LeitoXML {

	public List<Negociacao> carrega(InputStream inputStream){
		XStream stream = new XStream(new DomDriver());
		stream.alias("negociacao", Negociacao.class);
		
		return (List<Negociacao>) stream.fromXML(inputStream);
	}
}