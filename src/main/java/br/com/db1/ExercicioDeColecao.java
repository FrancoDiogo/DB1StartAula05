package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDeColecao {

	List<String> cores = new ArrayList<String>();
	List<String> parentes = new ArrayList<String>();

	public ExercicioDeColecao() {
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Branco");
		parentes.add("Pai");
		parentes.add("Mae");
		parentes.add("Irmao");
		parentes.add("Irma");
		parentes.add("Tio");
		parentes.add("Tia");
		parentes.add("Primos");	
	}
	
	public List<String> exercicio1() {
		return cores;
	}

	public Integer exercicio2() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Diogo");
		nomes.add("Franco");
		return nomes.size();
	}

	public List<String> exercicio3() {
		parentes.remove("Pai");
		parentes.remove("Mae");
		return parentes;
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
		cores.remove("Azul");
		return cores;
	}

	public List<String> exercicio7() {
		Collections.sort(parentes, Collections.reverseOrder());
		return parentes;
	}

	public List<Integer> exercicio8() {
		for (parametro % 2 == 0){
		return null;}
	}
}