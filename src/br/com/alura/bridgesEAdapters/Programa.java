package br.com.alura.bridgesEAdapters;

import java.util.Calendar;

public class Programa {
	
	public static void main(String[] args) throws Exception {
			
	Mapa mapa = new GoogleMaps(); 
	mapa.devolveMapa("Rua vergueiro");
	
	Relogio relogio = new RelogioDoSistema();
	Calendar dataAtual = relogio.hoje();
	
	}	
}

