 package br.com.alura.estruturasDeDadosEOVisitor;

import br.com.alura.dSLsEOInterpreter.Divisao;
import br.com.alura.dSLsEOInterpreter.Multiplicacao;
import br.com.alura.dSLsEOInterpreter.Numero;
import br.com.alura.dSLsEOInterpreter.RaizQuadrada;
import br.com.alura.dSLsEOInterpreter.Soma;
import br.com.alura.dSLsEOInterpreter.Subtracao;

public class PreFixaVisitor implements Visitor {

	@Override
	public void visitaSoma(Soma soma) {
        System.out.print(" + ");
        System.out.print("(");
        soma.getEsquerda().aceita(this);
        soma.getDireita().aceita(this);
        System.out.print(")");		
	}

	@Override
	public void visitaSubstracao(Subtracao subtracao) {
        System.out.print(" - ");
        System.out.print("(");
        subtracao.getEsquerda().aceita(this);
        subtracao.getDireita().aceita(this);
        System.out.print(")+");		
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
        System.out.print(" * ");
        System.out.print("(");
        multiplicacao.getEsquerda().aceita(this);
        multiplicacao.getDireita().aceita(this);
        System.out.print(")");		
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
        System.out.print(" / ");
        System.out.print("(");
        divisao.getEsquerda().aceita(this);
        divisao.getDireita().aceita(this);
        System.out.print(")");
		
	}

	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada) {
        System.out.print(" raizQuadrada ");
        System.out.print("(");
        raizQuadrada.getExpressao().aceita(this);
        raizQuadrada.getExpressao().aceita(this);
        System.out.print(")");
		
	}

	@Override
	public void visitaNumero(Numero numero) {
        System.out.print(numero.getNumero());
		
	}

}
