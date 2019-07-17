package adapter;

import java.util.ArrayList;
import java.util.List;

import model.SomadorEsperado;
import model.SomadorExistente;

public class SomadorAdapter implements SomadorEsperado {
	
	private SomadorExistente somador;
	private List<Integer> lista = new ArrayList<Integer>();
	
	public SomadorAdapter() {
		this.somador = new SomadorExistente();
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		
		for (int i: vetor) {
			this.lista.add(i);
		}
		
		return this.somador.somaLista(lista);
	}
	
}
