package br.com.alura.fa�adesESingletons;

public class Programa {

	public static void main(String[] args) {

		EmpresaFacade facade = new EmpresaFacadeSingleton().getInstancia();
		facade.buscaCliente(cpf);
		facade.criaFatura(cliente, valor);

	}

}
