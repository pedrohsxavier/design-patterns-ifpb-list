package gof;

public abstract class NumeroDecorator implements Numero {
	
	private Numero numero;
	
	public NumeroDecorator(Numero n) {
		this.numero = n;
	}
	
	public Numero getNumero() {
		return this.numero;
	}
}
