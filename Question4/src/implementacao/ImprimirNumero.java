package implementacao;

public class ImprimirNumero implements ImprimirItem {

	@Override
	public void imprimir(String item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimir(String item, int marcador) {
		System.out.println(marcador + ". " + item);
	}

	
}
