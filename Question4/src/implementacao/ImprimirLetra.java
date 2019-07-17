package implementacao;

public class ImprimirLetra implements ImprimirItem {

	@Override
	public void imprimir(String item, int marcador) {
		System.out.println((char) (marcador + 64) + ". " + item);
	}
	
	@Override
	public void imprimir(String item) {
		// TODO Auto-generated method stub

	}
	
}
