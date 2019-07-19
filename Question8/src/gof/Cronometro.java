package gof;

public class Cronometro extends Interceptador {

	public Cronometro(Componente componente) {
		super(componente);
	}
	
	@Override
	public void executarTarefa() {
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.getComponente().executarTarefa();
	} 
}
