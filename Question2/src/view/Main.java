package view;

import adapter.SomadorAdapter;
import model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		SomadorAdapter somador = new SomadorAdapter();
		Cliente c1 = new Cliente(somador);
		c1.executar();
		
	}

}
