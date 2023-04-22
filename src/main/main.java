package main;

import chromosome.*;
import tools.generateChromosome;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		chromosome3 chr1 =new chromosome3();
		System.out.println(chr1.length());
		System.out.println(chr1.genes());

		//generate a sample random chromosome1
		System.out.println("Sequence : "+chr1.sequence);
		generateChromosome gentool= new generateChromosome(chr1);
		//gentool.chromosome=chr1;
		chr1.sequence=gentool.generateRandomChromosomeSequence(chr1);
		System.out.println("End");
	}

}
