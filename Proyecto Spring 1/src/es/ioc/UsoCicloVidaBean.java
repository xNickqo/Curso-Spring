package es.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Cargar el XML de condiguracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		//Obtencion del Bean
		Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		//cerrar el contexto
		contexto.close();
	}

}
