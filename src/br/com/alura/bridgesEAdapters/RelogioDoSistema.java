package br.com.alura.bridgesEAdapters;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance(); // pega a hora atual
	}

}
