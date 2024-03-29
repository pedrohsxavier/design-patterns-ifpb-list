package model;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;

public class Elementos {

	List<Componente> lista;
	
	public Elementos() {
		this.lista = new ArrayList<Componente>();
	}
	
	public void add(Componente novo) {
		this.lista.add(novo);
	}
	
	public void remove(Componente c) {
		this.lista.remove(c);
	}
	
	public String toString() {
		return this.lista.toString();
	}
}
