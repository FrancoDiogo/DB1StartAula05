package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ExercicioDeColecaoTest {
	
	ExercicioDeColecao exercicio = new ExercicioDeColecao();
	
	@Test
	public void Exercicio1Test() {
		List<String> cores = exercicio.exercicio1();
		assertTrue(cores.get(0) == "Azul");
		assertTrue(cores.get(1) == "Preto");
		assertTrue(cores.get(2) == "Branco");	
	}
	
	@Test
	public void Exercicio2Test() {
		assertTrue(2 == exercicio.exercicio2());
	}
	
	@Test
	public void Exercicio3Test() {
		List<String> nomes = exercicio.exercicio3();
		assertFalse(nomes.contains("Pai" + "Mae"));
	}
	
	@Test
	public void Exercicio4Test() {
		List<String> cidades = exercicio.exercicio4();
		assertFalse(cidades.contains("Sarandi"));
	}
	
	@Test
	public void Exercicio5Test() {
		List<String> cores = exercicio.exercicio5();
		assertTrue(cores.get(0) == "Azul");
		assertTrue(cores.get(1) == "Branco");
		assertTrue(cores.get(2) == "Preto");	
	}
}