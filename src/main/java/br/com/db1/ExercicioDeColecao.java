package br.com.db1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExercicioDeColecao {
	
	List<String> cores = Arrays.asList("Azul" , "Preto" , "Branco");
	
	public List<String> exercicio1() {
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
	
	public List<String> exercicio5() {
		Collections.sort(cores);
		return cores;
	}

	public List<String> exercicio6() {
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Branco");
		cores.remove("Azul");
		return cores;
	}
}