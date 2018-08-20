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
	
	@Test
	public void exercicio8Test(){
		exercicio.exercicio8();
		assertTrue(exercicio.pares.get(0) == 2);
		assertTrue(exercicio.pares.get(1) == 4);
		assertTrue(exercicio.pares.get(2) == 6);
		assertTrue(exercicio.pares.get(3) == 8);
		assertTrue(exercicio.pares.get(4) == 10);
		assertTrue(exercicio.pares.get(5) == 12);
		assertTrue(exercicio.pares.get(6) == 14);
		assertTrue(exercicio.pares.get(7) == 16);
		assertTrue(exercicio.pares.get(8) == 18);
		assertTrue(exercicio.pares.get(9) == 20);
		
		assertTrue(exercicio.impares.get(0) == 1);
		assertTrue(exercicio.impares.get(1) == 3);
		assertTrue(exercicio.impares.get(2) == 5);
		assertTrue(exercicio.impares.get(3) == 7);
		assertTrue(exercicio.impares.get(4) == 9);
		assertTrue(exercicio.impares.get(5) == 11);
		assertTrue(exercicio.impares.get(6) == 13);
		assertTrue(exercicio.impares.get(7) == 15);
		assertTrue(exercicio.impares.get(8) == 17);
		assertTrue(exercicio.impares.get(9) == 19);
	}
}