package view;

import composite.Componente;
import model.Celula;
import model.Linha;
import model.Tabela;

public class Main {

	public static void main(String[] args) {
		
		Componente c1 = new Celula("Nome do carro:");
		Componente c2 = new Celula("Fabricante:");
		Componente c3 = new Celula("Preço (R$):");
		
		Componente c4 = new Celula("RX-8");
		Componente c5 = new Celula("Mazda");
		Componente c6 = new Celula("R$150.000,00");
		
		Componente c7 = new Celula("350Z");
		Componente c8 = new Celula("Nissan");
		Componente c9 = new Celula("R$120.000,00");
		
		Componente c10 = new Celula("Camaro");
		Componente c11 = new Celula("Chevrolet");
		Componente c12 = new Celula("R$130.000,00");
		
		Linha l1 = new Linha();
		Linha l2 = new Linha();
		Linha l3 = new Linha();
		Linha l4 = new Linha();
		
		l1.adicionar(c1);
		l1.adicionar(c2);
		l1.adicionar(c3);
		
		l2.adicionar(c4);
		l2.adicionar(c5);
		l2.adicionar(c6);
		
		l3.adicionar(c7);
		l3.adicionar(c8);
		l3.adicionar(c9);
		
		l4.adicionar(c10);
		l4.adicionar(c11);
		l4.adicionar(c12);
		
		Tabela t = new Tabela();
		t.adicionar(l1);
		t.adicionar(l2);
		t.adicionar(l3);
		t.adicionar(l4);
		
		t.imprimir();

	}

}
