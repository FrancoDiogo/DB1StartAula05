package br.com.db1.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EstadosDoBrasilTest {
	
	@Test
	public void escritaCertaNomeDosEstadosTest() {
		assertEquals("Paraná", EstadosDoBrasil.PARANA.getNomeDoEstado());
	}
	
	@Test
	public void ufParaEstadosTest() {
		assertEquals("PR", EstadosDoBrasil.PARANA.getUf());
	}
	
	@Test
	public void estadosDoSulTest(){
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.RIO_GRANDE_DO_SUL));
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.SANTA_CATARINA));
		assertTrue(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.PARANA));
		assertFalse(EstadosDoBrasil.getEstadosDoSul().contains(EstadosDoBrasil.SAO_PAULO));
	}
	
	@Test
	public void estadosDoSudesteTest() {
		assertTrue(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.SAO_PAULO));
		assertTrue(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.RIO_DE_JANEIRO));
		assertTrue(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.ESPIRITO_SANTO));
		assertTrue(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.MINAS_GERAIS));
		assertFalse(EstadosDoBrasil.getEstadosDoSudeste().contains(EstadosDoBrasil.MATO_GROSSO));
	}
	
	@Test
	public void estadosDoCentroOesteTest() {
		assertTrue(EstadosDoBrasil.getEstadosDoCentroOeste().contains(EstadosDoBrasil.MATO_GROSSO_DO_SUL));
		assertTrue(EstadosDoBrasil.getEstadosDoCentroOeste().contains(EstadosDoBrasil.MATO_GROSSO));
		assertTrue(EstadosDoBrasil.getEstadosDoCentroOeste().contains(EstadosDoBrasil.GOIAS));
		assertTrue(EstadosDoBrasil.getEstadosDoCentroOeste().contains(EstadosDoBrasil.DISTRITO_FEDERAL));
		assertFalse(EstadosDoBrasil.getEstadosDoCentroOeste().contains(EstadosDoBrasil.TOCANTINS));
	}
	
	@Test
	public void estadosDoNorteTest() {
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.TOCANTINS));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.RONDONIA));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.ACRE));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.AMAZONAS));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.PARA));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.AMAPA));
		assertTrue(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.RORAIMA));
		assertFalse(EstadosDoBrasil.getEstadosDoNorte().contains(EstadosDoBrasil.BAHIA));
	}
	
	@Test
	public void estadosDoNordesteTest() {
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.BAHIA));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.SERGIPE));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.ALAGOAS));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.PERNAMBUCO));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.PARAIBA));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.RIO_GRANDE_DO_NORTE));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.CEARA));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.PIAUI));
		assertTrue(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.MARANHAO));
		assertFalse(EstadosDoBrasil.getEstadosDoNordeste().contains(EstadosDoBrasil.PARANA));
	}
}