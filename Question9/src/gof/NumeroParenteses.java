package gof;

public class NumeroParenteses extends NumeroDecorator {

	public NumeroParenteses(Numero numero) {
		super(numero);
	}
	
	@Override
	public void imprimir() {
		System.out.println("(");
		this.getNumero().imprimir();
		System.out.println(")");
	}
}
