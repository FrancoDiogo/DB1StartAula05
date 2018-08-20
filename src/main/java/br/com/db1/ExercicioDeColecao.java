package br.com.db1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ExercicioDeColecao {

	List<String> cores = new ArrayList<String>();
	List<String> parentes = new ArrayList<String>();
	List<Integer> pares = new ArrayList<Integer>();
	List<Integer> impares = new ArrayList<Integer>();

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

	public void exercicio8() {
		for (Integer x = 1; x < 21; x++) {
			
			if (x % 2 == 0) {
				pares.add(x);
				continue;
			}
			impares.add(x);
		}
	}

	public TreeSet<String> exercicio9() {
		TreeSet<String> nomesDistintos = new TreeSet<String>();
		nomesDistintos.add("ANA");
		nomesDistintos.add("ANA LAURA");
		nomesDistintos.add("JOSE");
		nomesDistintos.add("WAGNER");
		nomesDistintos.add("RODOLFO");
		nomesDistintos.add("ROBERVAL");
		nomesDistintos.add("RODOLPHO");
		nomesDistintos.add("VAGNER");
		nomesDistintos.add("JOSÉ");
		nomesDistintos.add("JOALDO");
		nomesDistintos.add("CLECIO");
		nomesDistintos.add("JOSÉ");
		nomesDistintos.add("MARIA");
		nomesDistintos.add("MARCOS");
		return nomesDistintos;
	}
}