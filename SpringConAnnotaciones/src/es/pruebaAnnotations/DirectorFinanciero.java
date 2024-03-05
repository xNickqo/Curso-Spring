package es.pruebaAnnotations;

public class DirectorFinanciero implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	private CreacionInforme informeFinanciero;

	public DirectorFinanciero(CreacionInforme informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

}
