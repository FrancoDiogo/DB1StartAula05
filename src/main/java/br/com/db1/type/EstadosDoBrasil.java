package br.com.db1.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EstadosDoBrasil {
	
	RIO_GRANDE_DO_SUL("Rio Grande Do Sul", "RS"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	PARANA("Paran�", "PR"),
	SAO_PAULO("S�o Paulo", "SP"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	ESPIRITO_SANTO("Esp�rito Santo", "ES"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
	MATO_GROSSO("Mato Grosso", "MT"),
	GOIAS("Goi�s", "GO"),
	DISTRITO_FEDERAL("Distrito Federal", "DF"),
	TOCANTINS("Tocantins", "TO"),
	RONDONIA("Rond�nia", "RO"),
	ACRE("Acre", "AC"),
	AMAZONAS("Amazonas", "AM"),
	PARA("Par�", "PA"),
	AMAPA("Amap�", "AP"),
	RORAIMA("Roraima", "RR"),
	BAHIA("Bahia", "BA"),
	SERGIPE("Sergipe", "SE"),
	ALAGOAS("Alagoas", "AL"),
	PERNAMBUCO("Pernambuco", "PE"),
	PARAIBA("Para�ba", "PB"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
	CEARA("Cear�", "CE"),
	PIAUI("Piau�", "PI"),
	MARANHAO("Maranh�o", "MA");	
	
	private String nomeDoEstado;
	private String uf;
	
	public String getUf() {
		return uf;
	}
	
	public String getNomeDoEstado() {
		return nomeDoEstado;
	}
	
	private EstadosDoBrasil(String nome, String uf) {
		this.nomeDoEstado = nome;
		this.uf = uf;
	}

	public static List<EstadosDoBrasil> getEstadosDoSul(){
		List<EstadosDoBrasil> uf = new ArrayList<EstadosDoBrasil>();
		uf.add(EstadosDoBrasil.RIO_GRANDE_DO_SUL);
		uf.add(EstadosDoBrasil.SANTA_CATARINA);
		uf.add(EstadosDoBrasil.PARANA);
		return uf;
	}

	public static List<EstadosDoBrasil> getEstadosDoSudeste(){
		List<EstadosDoBrasil> uf = new ArrayList<EstadosDoBrasil>();
		uf.add(EstadosDoBrasil.SAO_PAULO);
		uf.add(EstadosDoBrasil.RIO_DE_JANEIRO);
		uf.add(EstadosDoBrasil.ESPIRITO_SANTO);
		uf.add(EstadosDoBrasil.MINAS_GERAIS);
		return uf;
	}

	public static List<EstadosDoBrasil> getEstadosDoCentroOeste() {
		List<EstadosDoBrasil> uf = new ArrayList<EstadosDoBrasil>();
		uf.add(EstadosDoBrasil.MATO_GROSSO_DO_SUL);
		uf.add(EstadosDoBrasil.MATO_GROSSO);
		uf.add(EstadosDoBrasil.GOIAS);
		uf.add(EstadosDoBrasil.DISTRITO_FEDERAL);
		return uf;
	}

	public static List<EstadosDoBrasil> getEstadosDoNorte() {
		return Arrays.asList(TOCANTINS, RONDONIA, ACRE, AMAZONAS, PARA, AMAPA, RORAIMA, BAHIA);
	}

	public static List<EstadosDoBrasil> getEstadosDoNordeste() {
		return Arrays.asList(BAHIA, SERGIPE, ALAGOAS, PERNAMBUCO, PARAIBA, RIO_GRANDE_DO_NORTE, CEARA, PIAUI, MARANHAO);
	}
}