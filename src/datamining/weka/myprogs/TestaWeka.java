package weka.myprogs;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class TestaWeka {

	public static void main(String[] args) 
			  throws Exception {    
	    //importa a base de dados ARFF utilizando classes da Weka
	    DataSource source = new DataSource
	    ("weather.arff");
	    Instances D = source.getDataSet();
	    //imprime informa��es associadas � base de dados
	    System.out.println("Num. instancias:" + D.numInstances());  
	    System.out.println("Num. atributos:" + D.numAttributes());  
	    //imprime o conte�do da base   
	    System.out.println("Base de Dados:");
	    System.out.println(D.toString());
	  }
}
