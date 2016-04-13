package br.com.guabiraba.tcc.datamining.clusters;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import weka.associations.tertius.IndividualInstances;
import weka.clusterers.SimpleKMeans;
import weka.core.Instances;

public class Cluster {

	public static BufferedReader readDataFile (String filename){
		BufferedReader inputReader = null;
		try {
			inputReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException ex) {
			System.err.println("File not found "+filename);
		}
		
		return inputReader;
	}
	
	public static void main(String[] args) throws Exception {
		SimpleKMeans kmeans = new SimpleKMeans();
		
		kmeans.setSeed(10);
		
		kmeans.setPreserveInstancesOrder(true);
		kmeans.setNumClusters(5);
		
		BufferedReader datafile = readDataFile("../../cpu.arff");
		Instances data = new Instances(datafile);
		
		kmeans.buildClusterer(data);
		
		int[] assignment = kmeans.getAssignments();
		
		int i = 0;
		for (int clusterNum : assignment) {
			System.out.printf("Instancia %d -> Cluster %d \n", i, clusterNum);
			i++;
		}
		
	}
	
}
