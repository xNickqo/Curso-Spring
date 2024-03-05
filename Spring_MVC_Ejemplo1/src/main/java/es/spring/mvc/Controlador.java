package es.spring.mvc;

import org.springframework.stereotype.Controller;

@Controller
public class Controlador {
	public String muestraPagina() {
		return "pagina ejemplo";
	}
}
