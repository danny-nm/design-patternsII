package br.com.alura.diferentesAcoesComCommand;

public class PagaPedido implements Comando {
	
	private Pedido p;
	public PagaPedido(Pedido p){
		this.p = p;		
	}

	@Override
	public void executa() {
		System.out.println("pagando pedido do: " + p.getCliente());
		p.paga();
	}

}
