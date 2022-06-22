package br.com.fourpark;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

	//private double total;
	public List<Vaga> vagas;
	public List<Ticket> tickets;

	public List<Vaga> getVagas() {
		return vagas;
	}

	public Estacionamento() {
		this.vagas = new ArrayList<>();
		this.tickets = new ArrayList<>();
	}

	public Integer registraEntrada(Ticket ticket) {
		if (ticket.getVaga().getIsOcupado()) {
			System.out.println("Esta vaga já está ocupada, por favor selecione uma disponível.");
			return null;
		} else {
			ticket.getVaga().setIsOcupado(true);
			this.tickets.add(ticket);		
			return tickets.indexOf(ticket);
		}
	}

	public String registraSaida(Ticket ticket, LocalTime horaSaida) {
		if (!ticket.getVaga().getIsOcupado()) {
			return "A vaga já está livre, por favor selecione a vaga correta.";
		} else {
			ticket.getVaga().setIsOcupado(false);
			ticket.setHoraSaida(horaSaida);
			Double intervalo = Double.valueOf(ticket.getHoraEntrada().until(horaSaida, ChronoUnit.MINUTES));
			return "R$ " + (intervalo * (ticket.getValorHora() / 60));
		}
	}

	public Ticket getTicket(Integer numTicket) {

		return tickets.get(numTicket);
	}

	public String vagasDisponiveis() {
		for (Vaga vaga : vagas) {
			if (!vaga.getIsOcupado()) {
				System.out.println(vaga);
			}
		}
		return null;

	}

	public void criarVagas(Integer qtdVagas) {
		vagas = new ArrayList<Vaga>();
		for (int x = 1; x <= qtdVagas; x++) {
			Vaga vaga = new Vaga(x);
			this.vagas.add(vaga);
		}
	}

}
