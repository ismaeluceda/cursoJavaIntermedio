package ejemplo4;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Listas y Mapas

public class MainEjemplo4 {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans4.xml");
	
	public static void main(String[] args) {
		Persona p = context.getBean("persona",Persona.class);
		p.getDireccion().setCiudad("Alcala");
		System.out.println(p);

		Persona p2 = context.getBean("persona2",Persona.class);
		System.out.println(p2);

		
	}
		

}
