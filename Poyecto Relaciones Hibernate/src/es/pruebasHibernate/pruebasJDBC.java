package es.pruebasHibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class pruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcUrl="jdbc:mysql://localhost:3306/relacioneshibernate?useSSL=false";
		
		String usuario="root";
		
		String contra="";
		
		try {
			
			Connection miConexion = DriverManager.getConnection(jdbcUrl,usuario,contra);
			System.out.println("Conexion Exitosa!!");

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
