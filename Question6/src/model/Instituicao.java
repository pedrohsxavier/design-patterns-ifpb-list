package model;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;

public class Instituicao implements Componente {

	private List<Individuo> membros;
	
	public Instituicao() {
		this.membros = new ArrayList<Individuo>();
	}
	
	public void add(Individuo i) {
		this.membros.add(i);
	}
	
	public void remove(Individuo i) {
		this.membros.remove(i);
	}
	
	@Override
	public int getAssento() {
		return 0;
	}

	@Override
	public int getMembros() {
		return this.membros.size()-1;
	}

	
}
