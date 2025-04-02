package main;

import pessoa.Atleta;
import pessoa.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Pessoa objPessoa = new Pessoa("Matheus", 80, 1.90);
		objPessoa.calcularIMC(1.90, 80);
		System.out.println(objPessoa.getNome() + "- IMC: " + objPessoa.calcularIMC(1.90, 80));
		
		Atleta objAtleta = new Atleta("Leila", 60, 1.65, "Natação");
		objAtleta.calcularIMC(1.65, 60);
		System.out.println(objAtleta.getNome() + " - IMC Ajustado: " + objAtleta.calcularIMC(1.65, 60));
		
		
		
				
		

	}

}
