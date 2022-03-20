package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
		
	int cantidadAsientos() {
		int valor;
		valor=0;
		for(int indice=0;indice<asientos.length;indice++) {
			if (asientos[indice]!=null) {
				valor=valor+1;
			}
			
		}
		return valor;
	}
	
	

}
