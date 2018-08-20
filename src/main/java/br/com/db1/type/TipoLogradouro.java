package br.com.db1.type;

public enum TipoLogradouro {
	
	RUA("Rua", "R"),
	FAZENDA("Fazenda", "FZ"),
	PRACA("Praça", "PC"),
	AVENIDA("Avenida", "AV");
	
	String descricaoLogradouro;
	String abreviacaoLogradouro;
	
	TipoLogradouro(String descricao, String abreviacao){
		descricaoLogradouro = descricao;
		abreviacaoLogradouro = abreviacao;
	}
	
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	
	public String getAbreviacaoLogradouro() {
		return abreviacaoLogradouro;
	}
}
