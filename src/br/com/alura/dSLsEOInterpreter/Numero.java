package br.com.alura.dSLsEOInterpreter;

import br.com.alura.estruturasDeDadosEOVisitor.Visitor;

public class Numero implements Expressao {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int avalia() {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaNumero(this);
	}
}
