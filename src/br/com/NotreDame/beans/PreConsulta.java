package br.com.NotreDame.beans;

public class PreConsulta {
	
	private String sintomas;
	private String intensidadeDor;
	private String dataOcorrido;
	private String descricao;
	
	public PreConsulta() {
		super();
	}

	public PreConsulta(String sintomas, String intensidadeDor, String dataOcorrido, String descricao) {
		super();
		this.sintomas = sintomas;
		this.intensidadeDor = intensidadeDor;
		this.dataOcorrido = dataOcorrido;
		this.descricao = descricao;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String getIntensidadeDor() {
		return intensidadeDor;
	}

	public void setIntensidadeDor(String intensidadeDor) {
		this.intensidadeDor = intensidadeDor;
	}

	public String getDataOcorrido() {
		return dataOcorrido;
	}

	public void setDataOcorrido(String dataOcorrido) {
		this.dataOcorrido = dataOcorrido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
