package br.com.db1;

import br.com.db1.type.TipoLogradouro;

public class ExemploEnum {
	
	public static void main(String[] args) {
		System.out.println(TipoLogradouro.RUA);
		System.out.println(TipoLogradouro.PRACA);
		System.out.println("-------------------");
		System.out.println(TipoLogradouro.RUA.getDescricaoLogradouro());
		System.out.println(TipoLogradouro.PRACA.getDescricaoLogradouro());
		System.out.println(TipoLogradouro.RUA.getAbreviacaoLogradouro());
		System.out.println(TipoLogradouro.FAZENDA.getAbreviacaoLogradouro());
		System.out.println(TipoLogradouro.PRACA.getAbreviacaoLogradouro());
		System.out.println(TipoLogradouro.AVENIDA.getAbreviacaoLogradouro());
	}
}
