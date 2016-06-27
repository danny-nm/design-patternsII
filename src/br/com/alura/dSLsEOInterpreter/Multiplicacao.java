package br.com.alura.dSLsEOInterpreter;

import br.com.alura.estruturasDeDadosEOVisitor.Visitor;

public class Multiplicacao implements Expressao{
	
	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao direita, Expressao esquerda){
		this.direita = direita;
		this.esquerda = esquerda;
	}

	@Override
	public int avalia() {
		int resultadoDaEsquerda = esquerda.avalia();
		int resultadoDaDireita = direita.avalia();
		return resultadoDaDireita * resultadoDaEsquerda;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaMultiplicacao(this);
	}	
}
