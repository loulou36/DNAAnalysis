package tools;

import chromosome.*;

public class generateChromosome {
	
	public chromosome chromosome;
	public generateChromosome(chromosome chr) {
		this.chromosome=chr;
	}
	public String generateRandomChromosomeSequence(chromosome chr) {
		String DNASequence="";
		int i;
		for (i = 0 ; i<=chr.length() ;i++)
		{
		DNASequence = DNASequence+randomAcid(0,3);	
		}
		return  DNASequence;
	}
	
	
	private char randomAcid(int min,int max) {
		// TODO Auto-generated method stub
		int random = min + (int)(Math.random() * ((max) + 1));
		char charRandom = ' ';
		if (random ==0 ) {
			charRandom='a';
		}if(random ==1 ) {
			charRandom='c';
		}if(random ==2 ) {
			charRandom='g';
		}if(random ==3 ) {
			charRandom='t';
		}
		return charRandom;

	}

}
