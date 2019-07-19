package gof;

public class Cliente {

	public static void main(String[] args) {
		
		new Interceptador(new Log(new VerificadorMinuto(new Cronometro(new ComponenteConcreto())))).executarTarefa();
	}

}
