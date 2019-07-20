package gof;

public class NumeroColchetes extends NumeroDecorator {
	
	public NumeroColchetes(Numero numero) {
		super(numero);
	}

	@Override
	public void imprimir() { 
		System.out.print("[");
		this.getNumero().imprimir();
		System.out.print("]");
	}
	
	
}
