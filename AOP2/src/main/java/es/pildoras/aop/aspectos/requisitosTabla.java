package es.pildoras.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component	
@Order(3)
public class requisitosTabla {
	@Before("es.pildoras.aop.aspectos.LoginConAspecto.paraClientes()")
	public void requisitosTabla() {
		System.out.println("Hay menos de 3000clientes en la tabla. Puedes insertar el nuevo cliente");
		System.out.println("");
	}
	
}
