package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {
	
	public List<String> exercicio1() {
		List<String> cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Branco");
		return cores;
	}
	
	public Integer exercicio2() {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Diogo");
		nomes.add("Franco");
		return nomes.size();
	}
}