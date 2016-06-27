package br.com.alura.fašadesESingletons;

public class EmpresaFacadeSingleton {

	public static EmpresaFacade instancia;

	public EmpresaFacade getInstancia() {
		if (instancia == null) {
			instancia = new EmpresaFacade();
		}

		return instancia;
	}

}
