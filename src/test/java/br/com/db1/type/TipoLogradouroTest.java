package br.com.db1.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TipoLogradouroTest {
	
	@Test
	public void siglaLogradouroTest() {
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("Fz", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals("Pc", TipoLogradouro.PRACA.getSiglaLogradouro());
		assertEquals("Av", TipoLogradouro.AVENIDA.getSiglaLogradouro());
	}
	
	@Test
	public void descricaoLogradouroTest() {
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLogradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLogradouro());
		assertEquals("Praça", TipoLogradouro.PRACA.getDescricaoLogradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLogradouro());
	}
}
