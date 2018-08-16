package br.com.db1;

import static org.junit.Assert.assertTrue;

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
}