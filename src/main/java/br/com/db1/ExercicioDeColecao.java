package br.com.db1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExercicioDeColecao {
	
	public List<String> exercicio1() {
		List<String> cores = Arrays.asList("Azul" , "Preto" , "Branco");
		return cores;
	}
	
	public Integer exercicio2() {
		List<String> nomes = Arrays.asList("Diogo" , "Franco");
		return nomes.size();
	}

	public List<String> exercicio3() {
		List<String> nomes = Arrays.asList("Pai" , "Mae" , "Irmao" , "Irma" , "Tio" , "Tia" , "Primos");
		nomes.remove("Pai" + "Mae");
		return nomes;
	}

	public List<String> exercicio4() {
		List<String> cidades = new ArrayList<String>();
		cidades.add("Maringa");
		cidades.add("Sarandi");
		cidades.add("Curitiba");
		cidades.remove(1);
		return cidades;
	}
}