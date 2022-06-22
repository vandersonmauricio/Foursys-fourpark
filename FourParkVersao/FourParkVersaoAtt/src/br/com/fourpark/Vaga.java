package br.com.fourpark;

public class Vaga {

	private Integer posicao;
	private Boolean isOcupado;

	public Vaga(Integer posicao) {
		this.posicao = posicao;
	}

	public void setIsOcupado(boolean isOcupado) {
		this.isOcupado = isOcupado;
	}

	public Boolean getIsOcupado() {
		return isOcupado;
	}

	@Override
	public String toString() {
		return "Vaga " + posicao + ", " + (isOcupado ? "Ocupada" : "Disponível");
	}

}
