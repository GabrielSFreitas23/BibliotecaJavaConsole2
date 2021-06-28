package models;

public class Cliente extends Pessoa{
	
	
	public Cliente() {
		this.multa = false;
	}
	
	private String endereco;
	private String telefone;
	private boolean multa;
	
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public boolean getMulta() {
		return multa;
	}
	
	public void setMulta(boolean multa) {
		this.multa = multa;
	}

	@Override
	public String toString() {
		return "\nCodigo: " + getCodigo() + 
				"\nNome: " + getNome() + 
				"\nSexo: " + getSexo() +
				"\nIdade: " + getIdade() +
				"\nCPF: " + getCpf() +
				"\nEndereço: " + getEndereco() +
				"\nTelefone: " + getTelefone();
	}
	

}
