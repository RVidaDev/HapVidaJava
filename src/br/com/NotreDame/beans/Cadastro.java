package br.com.NotreDame.beans;

public class Cadastro {
	private String nomeCompleto;
	private String CPF;
	private String email;
	private int telefone;
	
	public Cadastro() {
		super();
	}

	public Cadastro(String nomeCompleto, String cPF, String email, int telefone) {
		super();
		this.nomeCompleto = nomeCompleto;
		CPF = cPF;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

}
