package es.ioc;

public class JefeEmpleado implements Empleados{
	
	private CreacionInformes informeNuevo;	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


	
	
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas de mis empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el Jefe"+ informeNuevo.getInforme();
	}
}
