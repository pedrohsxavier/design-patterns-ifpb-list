package gof;

public class Cliente {

	public static void main(String[] args) {
		
		Fanta f1 = new Fanta();
		Pepsi p1 = new Pepsi(); 
		
		TamanhoMedio r1 = new TamanhoMedio(new CocaCola());
		TamanhoPequeno r2 = new TamanhoPequeno(new Guarana());
		TamanhoGrande r3 = new TamanhoGrande(f1);
		TamanhoMedio r4 = new TamanhoMedio(p1);
		
		r1.beber();
		r2.beber();
		r3.beber();
		r4.beber();
	}

}
