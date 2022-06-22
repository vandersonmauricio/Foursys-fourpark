package br.com.fourpark;

public class Proprietario {

	private String nome;
	private String cpf;
	private String contato;
	
	public Proprietario(String nome, String cpf, String contato) {
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
	
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
}
	
	

