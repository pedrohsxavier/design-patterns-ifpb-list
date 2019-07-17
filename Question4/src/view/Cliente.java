package view;

import abstracao.Lista;
import abstracao.ListaNaoOrdenada;
import abstracao.ListaOrdenada;
import implementacao.ImprimirItem;
import implementacao.ImprimirLetra;
import implementacao.ImprimirMarcador;
import implementacao.ImprimirNumero;

public class Cliente {

	public static void main(String[] args) {

		ImprimirItem marcadorLetra = new ImprimirLetra();
		ImprimirItem marcador = new ImprimirMarcador("*");
		ImprimirItem marcadorNumero = new ImprimirNumero();
		
		Lista listaOrdenada = new ListaOrdenada(marcadorNumero);
		Lista listaOrdenada1 = new ListaOrdenada(marcadorLetra);
		Lista listaNaoOrdenada = new ListaNaoOrdenada(marcador);
		
		System.out.println("Lista Ordenada: ");
		listaOrdenada.adicionar("Ferrari");
		listaOrdenada.adicionar("Lamborghini");
		listaOrdenada.adicionar("Porsche");
		listaOrdenada.imprimir();
		System.out.println();
		
		System.out.println("Lista Ordenada com Letra:");
		listaOrdenada1.adicionar("BMW");
		listaOrdenada1.adicionar("Peugeot");
		listaOrdenada1.adicionar("Renault");
		listaOrdenada1.imprimir();
		System.out.println();
		
		System.out.println("Lista n�o Ordenada com Marcador:");
		listaNaoOrdenada.adicionar("Nissan");
		listaNaoOrdenada.adicionar("Toyota");
		listaNaoOrdenada.adicionar("Volvo");
		listaNaoOrdenada.imprimir();
		
	}

}
