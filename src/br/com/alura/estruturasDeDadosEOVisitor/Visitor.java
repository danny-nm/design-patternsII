package br.com.alura.estruturasDeDadosEOVisitor;

import br.com.alura.dSLsEOInterpreter.Divisao;
import br.com.alura.dSLsEOInterpreter.Multiplicacao;
import br.com.alura.dSLsEOInterpreter.Numero;
import br.com.alura.dSLsEOInterpreter.RaizQuadrada;
import br.com.alura.dSLsEOInterpreter.Soma;
import br.com.alura.dSLsEOInterpreter.Subtracao;

public interface Visitor {

	void visitaSoma(Soma soma);

	void visitaSubstracao(Subtracao subtracao);

	void visitaMultiplicacao(Multiplicacao multiplicacao);

	void visitaDivisao(Divisao divisao);

	void visitaRaizQuadrada(RaizQuadrada raizQuadrada);

	void visitaNumero(Numero numero);

}