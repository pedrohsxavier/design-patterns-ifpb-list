package model;

import composite.Componente;

public class Celula implements Componente {

	private String conteudo;
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public static String padRight(String s, int n) {
		return String.format("%-" + n + "s", s);
	}
	
	@Override
	public void imprimir() {
		 // Limita o conteúdo a exatamente 15 caracteres.
		conteudo = conteudo + " ";
//		conteudo = conteudo.substring(0, 15);
		// Imprime na mesma linha e com borda lateral.
		System.out.println(" | " + padRight(conteudo, 15));
	}
}
