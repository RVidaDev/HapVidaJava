package br.com.NotreDame.beans;
import java.io.Serializable;

public class ListarCadastro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;

	public ListarCadastro() {
		super();
	}

	public ListarCadastro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
