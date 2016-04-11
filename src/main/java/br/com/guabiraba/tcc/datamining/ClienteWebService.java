package br.com.guabiraba.tcc.datamining;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import br.com.guabiraba.tcc.model.Negociacao;
import br.com.guabiraba.tcc.reader.LeitoXML;

public class ClienteWebService {

	private static final String URL_WEBSERVICE = ("http://developers.agenciaideias.com.br/cotacoes/xml");
		
	public List<Negociacao> getNegociacoes(){
		HttpURLConnection connection = null;
		
		
		try {
			URL url = new URL(URL_WEBSERVICE);
			
			connection = (HttpURLConnection)url.openConnection();
			
			InputStream content = connection.getInputStream();
			
			return new LeitoXML().carrega(content);
			
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally{
			connection.disconnect();
		}
		
		
		
		
	}
}
