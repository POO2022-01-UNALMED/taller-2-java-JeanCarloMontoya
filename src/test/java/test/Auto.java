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
				valor=valor+1;}
			}
			
		
		return valor;}
	
	String verificarIntegridad() {
		String valor;
		valor="";
		if (registro==motor.registro) {
			for(int indice=0;indice<asientos.length;indice++) {
				if ((asientos[indice]!=null)&&(asientos[indice].registro!=registro)){
					return "Las piezas no son originales";
					break;
					
				
				} else if((asientos[indice]!=null)&&(asientos[(asientos.length-1)].registro==registro)) {
					return "Auto original";
				}
				
			}
			}
		else
			return "Las piezas no son originales";
		 
		}
	
	
	}
