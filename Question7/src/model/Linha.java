package model;

import java.util.ArrayList;
import java.util.List;

import composite.Componente;

public class Linha implements Componente {
	
	private List<Componente> celulas = new ArrayList<Componente>();
	
	@Override
	public void imprimir() {
		
		// Imprime a borda lateral.
		//System.out.println(" |");
		// Imprime a linha.
		
		for (Componente c : celulas) {
			c.imprimir();
		}
		System.out.println(" ");
		
		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];
		for (int i = 0; i < tamanho; i++) {
			linha[i] = '-';
		}
		System.out.println(" " + new String(linha));
	}
	
	public void adicionar(Componente c) {
		celulas.add(c);
	}

}
