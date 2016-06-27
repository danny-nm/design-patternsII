package br.com.alura.diferentesAcoesComCommand;

public class ConcluiPedido implements Comando {

	private Pedido p;
	public ConcluiPedido(Pedido p) {
		this.p = p;	
	}

	@Override
	public void executa() {
		System.out.println("concluido pedido de: " + p.getCliente());
		p.finaliza();
	}	

}
