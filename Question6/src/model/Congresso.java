package model;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;

public class Congresso {

	private int totalAssentos;
	private List<Componente> participantes;
	
	public Congresso(int assentos) {
		this.totalAssentos = assentos;
		this.participantes = new ArrayList<Componente>();
	}
	
	public int totalAssentos() {
		return this.totalAssentos;
	}
	
	public int totalParticipantes() {
		int totalParticipantes = 0;
		for(Componente c : participantes) {
			if (c instanceof Individuo) {
				totalParticipantes++;
			}else if (c instanceof Instituicao) {
				totalParticipantes += c.getMembros();
			}
		}
		return totalParticipantes;
	}
	
	public void add(Componente c) {
		if (c instanceof Individuo) {
			if (totalAssentos > this.participantes.size()) {
				this.participantes.add(c);
			} else {
				throw new UnsupportedOperationException("N�o h� assentos dispon�veis!");
			}
		} else if (c instanceof Instituicao) {
			if (totalAssentos > this.participantes.size() + c.getMembros()) {
				this.participantes.add(c);
			}else {
				throw new UnsupportedOperationException("N�o h� n�mero suficiente de assentos para institui��o!");
			}
		}
			
	}
	
	public void remove(Componente c) {
		this.participantes.remove(c);
	}
	
	
}
