package gof;

public class ComponenteConcreto implements Componente {
	
	private Componente componente;
	
	public void executarTarefa() { 
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
}