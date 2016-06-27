package br.com.alura.dSLsEOInterpreter;

import br.com.alura.estruturasDeDadosEOVisitor.ImpressoraVisitor;
import br.com.alura.estruturasDeDadosEOVisitor.PreFixaVisitor;
import br.com.alura.estruturasDeDadosEOVisitor.Visitor;

public class Programa {

	public static void main(String[] args) {

		Expressao esquerda = new Subtracao(new Numero(5), new Numero(10));
		Expressao direita = new Soma(new Numero(2), new Numero(10));
		
		Expressao conta = new Soma(esquerda, direita);
		
		int resultado = conta.avalia();
		System.out.println(resultado);
		
		Visitor impressora = new ImpressoraVisitor();
		conta.aceita(impressora);
		
		System.out.println("\nForma Pré-Fixa:");
		PreFixaVisitor pfv = new PreFixaVisitor();
		conta.aceita(pfv);
	}

}
