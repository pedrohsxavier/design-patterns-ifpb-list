package gof;

import java.util.ArrayList;
import java.util.HashMap;

public class MapAdapter extends HashMap {

	public MapAdapter() {
		super();
	}
	
	public void put(ArrayList<Integer> key, ArrayList<Integer> value) {
		for (int i = 0; i < key.size(); i++) {
			super.put(key.get(i), value.get(i));
		}
	}
	
	public void setMatriz(int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				//super.put(matriz[i], matriz[j]);
				System.out.println(matriz[i] + " " + matriz[j]);
			}
		}
	}
}
