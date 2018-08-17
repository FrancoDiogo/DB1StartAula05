package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class ExercicioDeColecaoTest {
	
	ExercicioDeColecao exercicio = new ExercicioDeColecao();
	
	@Test
	public void Exercicio1Test() {
		List<String> cores = exercicio.exercicio1();
		assertTrue(cores.contains("Azul"));
		assertTrue(cores.contains("Preto"));
		assertTrue(cores.contains("Branco"));	
	}
	
	@Test
	public void Exercicio2Test() {
		assertTrue(2 == exercicio.exercicio2());
	}
	
	@Test
	public void Exercicio3Test() {
		List<String> parentes = exercicio.exercicio3();
		assertFalse(parentes.contains("Pai"));
		assertFalse(parentes.contains("Mae"));
	}
	
	@Test
	public void Exercicio4Test() {
		List<String> cidades = exercicio.exercicio4();
		assertFalse(cidades.contains("Sarandi"));
	}
	
	@Test
	public void Exercicio5Test() {
		List<String> cores = exercicio.exercicio5();
		assertTrue(cores.contains("Azul"));
		assertTrue(cores.contains("Branco"));
		assertTrue(cores.contains("Preto"));
	}
	
	@Test
	public void Exercicio6Test() {
		List<String> cores = exercicio.exercicio6();
		assertFalse(cores.contains("Azul"));
	}
	
	@Test
	public void Exercicio7Test() {
		List<String> parentes = exercicio.exercicio7();
		assertTrue(parentes.contains("Tio"));
		assertTrue(parentes.contains("Tia"));
		assertTrue(parentes.contains("Primos"));
		assertTrue(parentes.contains("Pai"));
		assertTrue(parentes.contains("Mae"));
		assertTrue(parentes.contains("Irmao"));
		assertTrue(parentes.contains("Irma"));
	}
}