package model;

import composite.Componente;

public class Individuo implements Componente {

	private int assento;
	
	public Individuo(int assento) {
		this.assento = assento;
	}
	
	@Override
	public int getAssento() {
		return this.assento;
	}

	@Override
	public int getMembros() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
