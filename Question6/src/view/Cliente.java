package view;

import model.Congresso;
import model.Individuo;
import model.Instituicao;

public class Cliente {

	public static void main(String[] args) {
		
		Congresso c1 = new Congresso(10);
		Individuo i1 = new Individuo(1);
		Individuo i2 = new Individuo(2);
		Instituicao inst1 = new Instituicao();
		
		inst1.add(i1);
		inst1.add(i2);
		
		c1.add(inst1);
		
		System.out.println("Total de Participantes: " + c1.totalParticipantes()); 
	}

}
