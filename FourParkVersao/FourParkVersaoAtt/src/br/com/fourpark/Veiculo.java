package br.com.fourpark;

public class Veiculo {

	private String placa;
	private String modelo;
	private String tipo;
	private Proprietario proprietario;

	public Veiculo(String placa, String modelo, String tipo, Proprietario proprietario) {
		this.placa = placa;
		this.modelo = modelo;
		this.tipo = tipo;
		this.proprietario = proprietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", tipo=" + tipo + ", proprietario=" + proprietario
				+ "]";
	}

}
