package abstracao;

import java.util.ArrayList;

import implementacao.ImprimirItem;

public class ListaNaoOrdenada implements Lista {

	private ArrayList<String> lista;
	private ImprimirItem item;
	
	public ListaNaoOrdenada(ImprimirItem item) {
		this.lista = new ArrayList<String>();
		this.item = item;
	}
	
	@Override
	public void adicionar(String s) {
		this.lista.add(s);
	}

	@Override
	public void imprimir() {
		for(String s: this.lista) {
			this.item.imprimir(s);
		}
	}
	
}
