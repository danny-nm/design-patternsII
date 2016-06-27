package br.com.alura.salvandoEstadosAnterioresEOMemento;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {

		Contrato c1 = new Contrato(Calendar.getInstance(), "Maurício", TipoContrato.NOVO);
		Historico historico = new Historico();
		historico.adiciona(c1.salvaEstado());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());

		System.out.println(c1.getTipo());
		c1.restaura(historico.pega(1));
		System.out.println(c1.getTipo());
	}

}
