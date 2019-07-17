package gof;

public class TamanhoGrande extends AbstracaoTamanho {

	public TamanhoGrande(ImplementacaoRefrigerante refrigerante) {
		super(refrigerante);
	}
	
	public void beber() {
		System.out.println("Toma um gole de " + refrigerante + ": " + this.toString());
		System.out.println("Acabou o(a) " + refrigerante + ": " + this.toString());
		System.out.println();
	}
	
	public String toString() {
		return "Tamanho Grande";
	}
}
