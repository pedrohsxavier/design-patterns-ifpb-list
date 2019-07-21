package model;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;

public class Tabela {
	
	private List<Componente> linhas = new ArrayList<Componente>();
	
	public void adicionar(Componente c) {
		linhas.add(c);
	}
	
	public void imprimir() {
		for (Componente c : linhas) {
			c.imprimir();
		}
	}

}
