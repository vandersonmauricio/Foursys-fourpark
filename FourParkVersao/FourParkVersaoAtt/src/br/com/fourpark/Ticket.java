package br.com.fourpark;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {

	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	private LocalDate data;
	private Double valorHora;
	private Vaga vaga;
	private Veiculo veiculo;
	// private Double valorPagar;

	public Ticket(LocalTime horaEntrada, LocalDate dataAtual, Double valorHora, Vaga vaga, Veiculo veiculo) {
		this.horaEntrada = horaEntrada;
		this.data = dataAtual;
		this.valorHora = valorHora;
		this.vaga = vaga;
		this.veiculo = veiculo;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Vaga getVaga() {
		return vaga;
	}

	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "Servico [horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + ", data=" + data + ", valorHora="
				+ valorHora + ", vaga=" + vaga + ", veiculo=" + veiculo + "]";
	}

}
