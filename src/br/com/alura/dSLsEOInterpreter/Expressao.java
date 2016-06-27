package br.com.alura.dSLsEOInterpreter;

import br.com.alura.estruturasDeDadosEOVisitor.Visitor;

public interface Expressao {
	
	int avalia();
	void aceita(Visitor visitor);

}
