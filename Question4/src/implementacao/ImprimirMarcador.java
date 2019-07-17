package implementacao;

public class ImprimirMarcador implements ImprimirItem {

	private String marcador;
	
	public ImprimirMarcador(String marcador) {
		this.marcador = marcador;
	}
	
	@Override
	public void imprimir(String item) {
		System.out.println(this.marcador + " " + item);
	}

	@Override
	public void imprimir(String item, int marcador) {
		// TODO Auto-generated method stub
		
	}
	
	
}
