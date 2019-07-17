package abstracao;

import java.util.ArrayList;

import implementacao.ImprimirItem;

public class ListaOrdenada implements Lista {

	private ArrayList<String> lista;
	private ImprimirItem item;
	
	public ListaOrdenada(ImprimirItem item) {
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
			this.item.imprimir(s, this.lista.indexOf(s) + 1);
		}
	}
	
	
}
