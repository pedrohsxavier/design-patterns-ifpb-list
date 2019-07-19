package gof;

import java.util.Calendar;

public class VerificadorMinuto extends Interceptador {

	public VerificadorMinuto(Componente componente) {
		super(componente);
	}
	
	@Override
	public void executarTarefa() {
		Calendar c = Calendar.getInstance();
		int minutes = c.get(Calendar.MINUTE); 
		if (minutes % 2 == 0) {
			System.out.println("Execução interrompida em minuto par: Minuto " + minutes);
			System.exit(1);
		}
		this.getComponente().executarTarefa();
	}
}
