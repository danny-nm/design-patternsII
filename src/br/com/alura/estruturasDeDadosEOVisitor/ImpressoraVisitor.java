package br.com.alura.estruturasDeDadosEOVisitor;

import br.com.alura.dSLsEOInterpreter.Divisao;
import br.com.alura.dSLsEOInterpreter.Multiplicacao;
import br.com.alura.dSLsEOInterpreter.Numero;
import br.com.alura.dSLsEOInterpreter.RaizQuadrada;
import br.com.alura.dSLsEOInterpreter.Soma;
import br.com.alura.dSLsEOInterpreter.Subtracao;

public class ImpressoraVisitor implements Visitor {
	
	@Override
	public void visitaSoma(Soma soma){
		System.out.print("(");		
		soma.getEsquerda().aceita(this);		
		System.out.print(" + ");		
		soma.getDireita().aceita(this);		
		System.out.print(")");
	}
	
	@Override
	public void visitaSubstracao(Subtracao subtracao){
		System.out.print("(");		
		subtracao.getEsquerda().aceita(this);		
		System.out.print(" + ");		
		subtracao.getDireita().aceita(this);		
		System.out.print(")");
		}
	
	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao){
		System.out.print("(");		
		multiplicacao.getEsquerda().aceita(this);		
		System.out.print(" * ");		
		multiplicacao.getDireita().aceita(this);		
		System.out.print(")");
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print("(");		
		divisao.getEsquerda().aceita(this);		
		System.out.print(" / ");		
		divisao.getDireita().aceita(this);		
		System.out.print(")");
		
	}
	
	@Override
	public void visitaRaizQuadrada(RaizQuadrada raizQuadrada){
		System.out.print("(");		
		raizQuadrada.getExpressao().aceita(this);		
		System.out.print(" raizQuadrada");		
		raizQuadrada.getExpressao().aceita(this);		
		System.out.print(")");
	}
	
	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
		
	}

}
