package es.pildoras.aop.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ClienteVIPDAO {

	public void insertaClienteVIP() {
		// TODO Auto-generated method stub
		System.out.println("Cliente VIP insertado con exito");
		System.out.println("");
	}
	
	@Bean(name="ClienteVIPDAO")
	public ClienteVIPDAO accDao() {
	    return new ClienteVIPDAO();
	}
}
