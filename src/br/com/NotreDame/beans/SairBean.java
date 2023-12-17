package br.com.NotreDame.beans;

public class SairBean {
	private static final long serialVersionUID = 1L;

    private boolean sair = false;

    public void sairDoCadastro() {
        this.sair = true;
    }

    public boolean isSair() {
        return sair;
    }

    public void setSair(boolean sair) {
        this.sair = sair;
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
